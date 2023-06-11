package com.luis.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.luis.model.Loja;

import java.util.List;

public class LojaDAO {
private EntityManagerFactory emf;

 public LojaDAO() {
    emf = Persistence.createEntityManagerFactory("my-persistence-unit");
}

public void salvarLoja(Loja loja) {
EntityManager em = emf.createEntityManager();
em.getTransaction().begin();
em.persist(loja);
em.getTransaction().commit();
em.close();
}

public Loja buscarLojaPorId(Long id) {
EntityManager em = emf.createEntityManager();
Loja loja = em.find(Loja.class, id);
em.close();
return loja;
}

public List<Loja> buscarTodasLojas() {
EntityManager em = emf.createEntityManager();
Query query = em.createQuery("SELECT p FROM Loja p");
List<Loja> lojas = query.getResultList();
em.close();
return lojas;
}
 public void atualizarLoja(Loja loja) {
EntityManager em = emf.createEntityManager();
em.getTransaction().begin();
 em.merge(loja);
em.getTransaction().commit();
em.close();
}

public void excluirLoja(Loja loja) {
EntityManager em = emf.createEntityManager();
em.getTransaction().begin();
loja = em.merge(loja);
em.remove(loja);
em.getTransaction().commit();
em.close();
}
}