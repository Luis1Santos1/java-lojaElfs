
import com.luis.DAO.LojaDAO;
import com.luis.model.Loja;
import javax.persistence.Entity;
import javax.persistence.Table;

public class App {



    public static void main(String[] args) {
        Tipo mangacurta = new Categori("MangaCurta");
        Camisa camisa = new Camisa("Camisa Milan 22/23", "R$15,90", "GG", "Milan", mangacurta);

        EntityManager em = JPAUtil.getEntityManager();
        CamisaDAO camisaDao = new CamisaDAO(em);
        TipoDAO tipoDAO = new TipoDAO(em);

        em.getTransation().begin();

        tipoDao.cadastrar(mangacurta);
        camisaDao.cadastrar(camisa);

        em.getTransation().commit();
        em.close();



    }
}

/*LojaDAO lojaDAO = new LojaDAO();

Loja loja = new Loja("Elfs Clothes", "Rua orphelia");

// Salva a Loja no banco de dados
lojaDAO.salvarLoja(loja);
System.out.println("Loja salva com sucesso!");

// Busca a Loja pelo ID
Loja lojaBuscada = lojaDAO.buscarLojaPorId(loja.getLong());

// Verifica se a Loja foi encontrada
if (lojaBuscada != null) {
    System.out.println("ID: " + lojaBuscada.getLong());
    System.out.println("Nome: " + lojaBuscada.getNome());
    System.out.println("Nome: " + lojaBuscada.getEndereco());
} else {
    System.out.println("Loja não encontrada.");
} */