package java.com.luis.dao;

import javax.persistence.EntityManager;
import java.util.Objects;

public class CamisaDAO {

    private EntityManager em;

    public CamisaDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Camisa camisa) {
        this.em.persist(camisa);
    }
    
}
