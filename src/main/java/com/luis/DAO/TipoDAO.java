package java.com.luis.dao;

import javax.persistence.EntityManager;
import java.util.Objects;
import java.com.luis.model.Camisa;

public class TipoDAO {

    private EntityManager em;

    public TipoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Tipo tipo) {
        this.em.persist(tipo);
    }
    
}
