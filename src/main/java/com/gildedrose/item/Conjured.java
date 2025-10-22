package com.gildedrose.item;

public class Conjured extends Item {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateIndividualItemQuality() {
        this.decreaseQuality();
        this.decreaseQuality();
        this.sellIn--;
        if (this.sellIn < 0) {
            this.decreaseQuality();
            this.decreaseQuality();
        }
    }
}
