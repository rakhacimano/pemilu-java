package pemilu.services;

import java.util.ArrayList;
import java.util.List;
import pemilu.models.User;

public class DatabaseService {

    private static List<User> users = new ArrayList<>();

    public static boolean addUser(User user) {
        String username = user.getUsername();
        boolean isUnique = true;

        for (User existingUser : users) {
            if (existingUser.getUsername().equals(username)) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            users.add(user);
        }

        return isUnique;
    }

    public static User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> getAllUsers() {
        return users;
    }

    public static void deleteUserByUsername(String usernameToDelete) {
        List<User> usersToRemove = new ArrayList<>();

        for (User user : users) {
            if (user.getUsername().equals(usernameToDelete)) {
                usersToRemove.add(user);
            }
        }

        users.removeAll(usersToRemove);
    }

    public static boolean isUsernameUnique(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // Username sudah ada, bukan unik
            }
        }
        return true; // Username unik
    }
}
