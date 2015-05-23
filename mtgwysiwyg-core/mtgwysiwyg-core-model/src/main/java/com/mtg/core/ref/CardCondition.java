package com.mtg.core.ref;

public enum CardCondition {
    MNM("Mint, near mint"),
    SP("Slightly played"),
    HP("Heavily played");
    private String label;
    private CardCondition(String label) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }
}
