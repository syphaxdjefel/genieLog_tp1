package com.gildedrose;

class GildedRose {
  Item[] items;

  public GildedRose(Item[] items) {
    this.items = items;
  }

  public void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      updateQualityForItem(items[i]);
    }

  }

  private void updateQualityForItem(Item item) {
    if (item.name.equals("Aged Brie")) {
      if (item.quality < 50) {
        item.quality = item.quality + 1;
      }

      item.sellIn = item.sellIn - 1;

      if (item.sellIn < 0) {

        if (item.quality < 50) {
          item.quality = item.quality + 1;
        }

      }
    }

    //666------------------------------------------------------------
    else {

      if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {

        if (item.quality < 50) {
          item.quality = item.quality + 1;

          if (item.sellIn < 11) {
            if (item.quality < 50) {
              item.quality = item.quality + 1;
            }
          }

          if (item.sellIn < 6) {
            if (item.quality < 50) {
              item.quality = item.quality + 1;
            }
          }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
          item.quality = 0;
        }

      }
      //fin if Backstage passes to a TAFKAL80ETC concert

      //si cest pas Backstage passes to a TAFKAL80ETC concert
      else {

        if (item.quality > 0) {
          if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = item.quality - 1;
          }
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
          item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
          if (item.quality > 0) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
              item.quality = item.quality - 1;
            }
          }

        }

      }
      //fin if !!Backstage passes to a TAFKAL80ETC concert

    }

  }

}