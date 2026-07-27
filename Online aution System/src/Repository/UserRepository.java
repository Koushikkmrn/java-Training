package Repository;

import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private Map<Integer, User> users;

    public UserRepository() {
        users = new HashMap<>();
        loadPreloadedUsers();
    }

    private void loadPreloadedUsers() {
        users.put(1, new User(1, "Rahul"));
        users.put(2, new User(2, "Arun"));
        users.put(3, new User(3, "Koushik"));
    }

    public User getUserById(int id) {
        return users.get(id);
    }

    public List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>(users.values());
        allUsers.sort(Comparator.comparingInt(User::getId));
        return allUsers;
    }
}
