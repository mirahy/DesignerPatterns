/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.agenda.dao;

import br.edu.ifms.agenda.database.Conexao;
import br.edu.ifms.agenda.model.Contato;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.HibernateException;

/**
 *
 * @author aluno
 */
public class ContatoDao {
    
     private static final String JPQL = "SELECT c FROM Contato c";

    private EntityManager getEntityManager() {
        return Conexao.createEntityManager();
    }

    
    public List<Contato> buscarPorNome(String nome) {
        EntityManager em = getEntityManager();
        String condicao = "";
        List<Contato> clientes = null;
        Boolean hasNome = nome != null && !nome.isBlank() && !nome.isEmpty();
        if (hasNome) {
            condicao = " WHERE c.nome LIKE ?1 or c.telefone LIKE ?1 or c.email LIKE ?1 ";
        }
        Query query = em.createQuery(JPQL + condicao);
        if (hasNome) {
            clientes = query.setParameter(1, "%" + nome + "%")
                    .getResultList();
        } else {
            clientes = query.getResultList();
        }
        em.close();
        return clientes;
    }


    public Contato inserir(Contato object) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (HibernateException ex) {
            em.getTransaction().rollback();
        }
        em.close();
        return object;
    }

 
    public Contato alterar(Contato object) {
        EntityManager em = getEntityManager();
        em.detach(object);
        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } catch (HibernateException ex) {
            em.getTransaction().rollback();
        }
        em.close();
        return object;
    }

   
    public void excluir(Object object) {
        Long id = (Long) object;
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Contato.class, id));
            em.getTransaction().commit();
        } catch (HibernateException ex) {
            em.getTransaction().rollback();
        }
        em.close();
    }


    public List<Contato> listar() {
        return buscarPorNome(null);
    }


    public Contato buscarPorId(Object object) {
        EntityManager em = getEntityManager();
        Long id = (Long) object;
        Contato obj = em.find(Contato.class, id);
        em.close();
        return obj;
    }

    
}
