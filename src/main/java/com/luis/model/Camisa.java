package com.luis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "camisas")
public class Camisa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tamanho;
    private double preco;
    private String time;
    @ManyToOne
    private Tipo tipo;

    public Camisa(Long id, String nome, String tamanho, double preco, String time) {
        this.id = id;
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
        this.time = time;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }



    public Camisa id(Long id) {
        setId(id);
        return this;
    }

    public Camisa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Camisa tamanho(String tamanho) {
        setTamanho(tamanho);
        return this;
    }

    public Camisa preco(double preco) {
        setPreco(preco);
        return this;
    }

    public Camisa time(String time) {
        setTime(time);
        return this;
    }



}
