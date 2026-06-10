package model.greenhouse.shop;

import enums.CurrencyType;

public class ShopItem {
    private String itemId;
    private String displayName;
    private int price;
    private CurrencyType currencyType;
    private int quantityPerPurchase;

    public ShopItem(String itemId, String displayName, int price, CurrencyType currencyType, int quantityPerPurchase) {
        this.itemId = itemId;
        this.displayName = displayName;
        this.price = price;
        this.currencyType = currencyType;
        this.quantityPerPurchase = quantityPerPurchase;
    }

    public String getItemId() { return itemId; }
    public String getDisplayName() { return displayName; }
    public int getPrice() { return price; }
    public CurrencyType getCurrencyType() { return currencyType; }
    public int getQuantityPerPurchase() { return quantityPerPurchase; }
}