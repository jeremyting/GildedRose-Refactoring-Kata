package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
        	updateItem(item);
        }
    }
    
    private void updateItem(Item item) {
    	 if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
         }
    	 
    	 if (item.name.equals("Aged Brie")) {
    		 item.updateAgedBrie(this);
         } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        	 item.updateBackstagePasses(this);
         } else {
        	 item.updateNormal(this);
         }
    }
    
    
}