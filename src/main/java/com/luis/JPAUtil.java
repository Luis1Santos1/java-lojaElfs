public class JPAUtil {
    
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("elfsfc");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
