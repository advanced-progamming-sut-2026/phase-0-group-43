package model.persistence;

import model.user.User;
import java.util.Map;
import java.util.HashMap;

public class UserRepository {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) { }
    public User getUser(String username) { return null; }
    public boolean exists(String username) { return false; }
}
