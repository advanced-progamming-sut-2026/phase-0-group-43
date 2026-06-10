package model.menu;

import java.util.List;

public class MenuState {
    private String name;
    private List<MenuState> allowedNextStates;

    public String getName() { return name; }
    public boolean canTransitionTo(MenuState target) { return false; }
}
