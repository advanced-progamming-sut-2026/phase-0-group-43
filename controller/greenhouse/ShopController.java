package controller.greenhouse;

import model.greenhouse.shop.Shop;
import model.entity.plant.PlantName;
import model.user.User;
import view.greenhouse.ShopView;

public class ShopController {

    private Shop shop;
    private User currentUser;
    private ShopView shopView;

    public ShopController(Shop shop, User currentUser, ShopView shopView) {
        this.shop        = shop;
        this.currentUser = currentUser;
        this.shopView    = shopView;
    }

    public void enterShop() {}
    public void showPermanentList() {}
    public void showDailyOffer() {}
    public void buyItem(String itemId, int count, PlantName plantType) {}
    private void applyPurchase(String itemId, int count, PlantName plantType) {}
}