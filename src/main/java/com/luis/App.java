package com.luis;
import com.luis.DAO.LojaDAO;
import com.luis.model.Loja;

public class App {
    public static void main(String[] args) {
        LojaDAO lojaDAO = new LojaDAO();

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
        }
    }
}