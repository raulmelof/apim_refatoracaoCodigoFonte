package com.gildedrose.item;

public class BackstagePasses extends Item {

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateIndividualItemQuality() {
        this.increaseQuality();
        if (this.sellIn <= 10) {
            this.increaseQuality();
        }
        if (this.sellIn <= 5) {
            this.increaseQuality();
        }
        this.sellIn--;
        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }
}
