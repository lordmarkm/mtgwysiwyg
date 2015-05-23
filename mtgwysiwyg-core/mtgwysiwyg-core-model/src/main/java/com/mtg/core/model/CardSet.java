package com.mtg.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

import com.baldy.commons.models.BaseEntity;
import com.mtg.core.model.player.Player;
import com.mtg.core.model.ref.Card;
import com.mtg.core.ref.CardCondition;

@Entity(name = "CARDSET")
public class CardSet extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "CARD_ID", nullable = false)
    private Card card;

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID", nullable = false)
    private Player player;

    @Column(name = "QTY")
    private int quantity;

    @Column(name = "COND")
    @Enumerated(EnumType.STRING)
    private CardCondition condition;

    @Column(name = "FOIL")
    @Type(type="yes_no")
    private boolean foil;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CardCondition getCondition() {
        return condition;
    }

    public void setCondition(CardCondition condition) {
        this.condition = condition;
    }

    public boolean isFoil() {
        return foil;
    }

    public void setFoil(boolean foil) {
        this.foil = foil;
    }

}
