package com.luis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.List;

@Entity // indicar que a classe Loja é uma entidade que será mapeada para uma tabela no bd
public class Loja {
    @Id // usado apra identificar a chave primária da entidade Loja
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera altomaticamente o ID
    private Long id;
    private String nome;
    private String endereco;
    private List<Camisa> camisas;
    private List<Cliente> clientes;

    public Loja(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;

    }

    public Long getLong() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Camisa> getCamisas() {
        return camisas;
    }

    public void setCamisas(List<Camisa> camisas) {
        this.camisas = camisas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
