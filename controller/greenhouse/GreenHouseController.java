package controller.greenhouse;

import controller.menu.IMenuState;
import controller.menu.MenuController;
import model.greenhouse.GreenHouse;
import model.greenhouse.shop.Shop;
import model.user.User;
import view.greenhouse.GreenHouseView;
import view.greenhouse.ShopView;

public class GreenHouseController implements IMenuState {

    private GreenHouse greenHouse;
    private ShopController shopController;
    private GreenHouseView greenHouseView;
    private User currentUser;

    public GreenHouseController(GreenHouse greenHouse, User currentUser,
                                GreenHouseView greenHouseView, ShopView shopView) {
        this.greenHouse      = greenHouse;
        this.currentUser     = currentUser;
        this.greenHouseView  = greenHouseView;
        this.shopController  = new ShopController(new Shop(), currentUser, shopView);
    }

    @Override
    public void enter(MenuController controller) {}

    @Override
    public void exit(MenuController controller) {}

    @Override
    public void handleCommand(String command, MenuController controller) {
        if (command.equals("enter shop"))            shopController.enterShop();
        else if (command.equals("shop list"))        shopController.showPermanentList();
        else if (command.equals("shop daily"))       shopController.showDailyOffer();
        else if (command.startsWith("shop buy"))     handleShopBuy(command);
        else                                         handleGreenhouseCommand(command);
    }

    private void handleShopBuy(String command) {}


    private void handleGreenhouseCommand(String command) {}
}