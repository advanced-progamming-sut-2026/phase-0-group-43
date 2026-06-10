package controller.menu;

public interface IMenuState {
    void handleCommand(String s, MenuController ctx);
    void enter(MenuController ctx);
    void exit(MenuController ctx);
}
