package model.menu;

import java.util.Stack;

public class MenuManager {
    private Stack<MenuState> menuStack;
    private MenuState currentState;

    public void enterMenu(MenuState newState) { }
    public void exitMenu() { }
    public void showCurrentMenu() { }
    public void logout() { }
}
