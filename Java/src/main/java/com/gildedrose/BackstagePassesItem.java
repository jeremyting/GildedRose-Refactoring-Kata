package com.gildedrose;

public class BackstagePassesItem extends Item{
	public BackstagePassesItem(String name, int sellIn, int quality) {
	    super(name, sellIn, quality);
	}

    public void upgradeBackstagePasses() {
        sellIn = sellIn - 1;
        increaseQuality();
        if (sellIn < 10) {
            increaseQuality();
        }
        if (sellIn < 5) {
            increaseQuality();
        }
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
