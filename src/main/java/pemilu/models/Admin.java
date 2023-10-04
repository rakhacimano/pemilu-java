package pemilu.models;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<User> users;
    private int userCount;

    public Admin(String name, String username, String password) {
        super(name, username, password); 
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        this.userCount++;
    }
    
    public int getUserCount() {
        return userCount;
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }
}

