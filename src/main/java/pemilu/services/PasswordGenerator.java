package pemilu.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import pemilu.models.User;

public class PasswordGenerator {
    
    private static List<User> users = new ArrayList<>();
    
    public static String generateRandomPassword() {
        // Logika untuk menghasilkan kata sandi acak, misalnya menggunakan Random
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        int length = 8; // Panjang kata sandi yang diinginkan

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
    
    public static boolean isPasswordUnique(String newPassword) {
        for (User user : users) {
            if (user.getPassword().equals(newPassword)) {
                return false; // Kata sandi sudah digunakan
            }
        }
        return true; // Kata sandi unik
    }
}
