package com.gildedrose;

public class NormalItem extends Item {
	public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

	 @Override
    public void upgrade() {
		decreaseQuality();
        if (getSellIn() < 0) {
            decreaseQuality();
        }
    }
}
