package com.mtg.core.model.ref;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.baldy.commons.models.BaseNamedEntity;

@Entity(name = "REF_CARD")
public class Card extends BaseNamedEntity {

    @ManyToOne
    @JoinColumn(name = "EXP_ID", nullable = false)
    private Expansion expansion;

    public Expansion getExpansion() {
        return expansion;
    }

    public void setExpansion(Expansion expansion) {
        this.expansion = expansion;
    }

}
