package model.greenhouse.shop;
import enums.CurrencyType;
import java.util.ArrayList;

public class List {

    public static final int POT_PRICE                  = 2000;
    public static final int PLANT_FOOD_PRICE           = 3;
    public static final int RANDOM_SEED_PRICE          = 1000;
    public static final int SELECTIVE_SEED_PRICE       = 5;
    public static final int CURRENCY_EXCHANGE_PRICE    = 5;

    public static final int PLANT_FOOD_MAX             = 3;
    public static final int POT_MAX                    = 20;

    public static final int RANDOM_SEED_PACKETS        = 5;
    public static final int SELECTIVE_SEED_PACKETS     = 10;
    public static final int CURRENCY_EXCHANGE_COINS    = 500;

    private java.util.List<ShopItem> permanentItems;

    public List() {
        permanentItems = new ArrayList<>();
        permanentItems.add(new ShopItem("pot",               "Pot (Greenhouse Slot)",    POT_PRICE,               CurrencyType.COIN,    1));
        permanentItems.add(new ShopItem("plant_food",        "Plant Food",               PLANT_FOOD_PRICE,        CurrencyType.DIAMOND, 1));
        permanentItems.add(new ShopItem("random_seed",       "Random Seed Bundle",       RANDOM_SEED_PRICE,       CurrencyType.COIN,    RANDOM_SEED_PACKETS));
        permanentItems.add(new ShopItem("selective_seed",    "Selective Seed Bundle",    SELECTIVE_SEED_PRICE,    CurrencyType.DIAMOND, SELECTIVE_SEED_PACKETS));
        permanentItems.add(new ShopItem("currency_exchange", "Currency Exchange",        CURRENCY_EXCHANGE_PRICE, CurrencyType.DIAMOND, CURRENCY_EXCHANGE_COINS));
    }

    public java.util.List<ShopItem> getPermanentItems() { return permanentItems; }

    public ShopItem findById(String itemId) {
        return permanentItems.stream()
                .filter(item -> item.getItemId().equals(itemId))
                .findFirst()
                .orElse(null);
    }
}