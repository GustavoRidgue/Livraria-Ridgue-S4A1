package br.com.ridgue.livraria.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Livro")
public class livrariaModel {
    @Id
    //toda vez q vc cria um regstro o valor de id e incrementado:
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private int id;

    @Column
    private String nome;

    @Column
    private String autor;

    @Column
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
