package com.gildedrose;

public class AgedBrieItem extends Item {
	public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void upgradeAgedBrie() {
        sellIn = sellIn - 1;
        increaseQuality();
        if (sellIn < 0) {
            increaseQuality();
        }
    }
}
