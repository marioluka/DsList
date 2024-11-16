package com.devsuperior.DsList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

//Mapeando como entidade e tabela
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    //Utilizando um ID de chaves estrangeiras da tabela relacionamento
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(){
    }

    //Construtor setando os valores para a tabela relacionamento
    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    //Getters e Setters
    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    //Para repeticoes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
