package com.devsuperior.DsList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

//Mapeando a classe para ser embeddada na tabela relacionamento como id
@Embeddable
public class BelongingPK {

    // Cardinalidade N:N
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK(){
    }

    //Construtor
    public BelongingPK(Game game, GameList list){
        this.game = game;
        this.list = list;
    }

    //Getters e Setters
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    //Para repeticoes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
