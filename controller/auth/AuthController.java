package controller.auth;

import model.user.User;
import java.util.Map;

public class AuthController {
    private Map<String, User> users;
    private User currentUser;

    public void register(String u, String p, String n, String e, String g) { }
    public void login(String u, String p, boolean stay) { }
    public void forgotPassword(String u, String e) { }
    public void logout() { }
    public void changeProfile(String field, String val) { }
    public User getCurrentUser() { return currentUser; }
}
