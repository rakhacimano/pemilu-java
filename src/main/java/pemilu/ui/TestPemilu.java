package pemilu.ui;

import java.util.List;
import java.util.Scanner;
import pemilu.models.Admin;
import pemilu.models.Candidate;
import pemilu.models.User;
import pemilu.models.Voter;
import pemilu.services.DatabaseService;

public class TestPemilu {

    public static void main(String[] args) {
        // Membuat admin
        //Admin admin = new Admin("admin", "admin");
        Admin admin = new Admin("Admin", "admin", "admin");

        // Membuat candidate
        Candidate candidate1 = new Candidate("Candidate1", "candidate1", "pass1");
        Candidate candidate2 = new Candidate("Candidate2", "candidate2", "pass2");

        // Membuat voter
        Voter voter1 = new Voter("Voter1", "voter1", "pass3");
        Voter voter2 = new Voter("Voter2", "voter2", "pass4");

        // Admin menambahkan user ke database
        DatabaseService.addUser(admin);
        DatabaseService.addUser(candidate1);
        DatabaseService.addUser(candidate2);
        DatabaseService.addUser(voter1);
        DatabaseService.addUser(voter2);

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        boolean repeatLogin;

        do {
            repeatLogin = false;

            // Voter melakukan login
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            User loggedInUser = DatabaseService.getUserByUsername(username);

            if (loggedInUser != null && loggedInUser.getPassword().equals(password)) {
                if (loggedInUser instanceof Voter) {
                    Voter voter = (Voter) loggedInUser;
                    if (!voter.hasVoted()) {
                        System.out.println("Login successful. You can now vote.");

                        // Menampilkan daftar candidate yang dapat dipilih dalam bentuk list
                        List<User> users = DatabaseService.getAllUsers();
                        int candidateCount = 0;
                        System.out.println("Candidates:");
                        for (User user : users) {
                            if (user instanceof Candidate) {
                                candidateCount++;
                                System.out.println(candidateCount + ". " + user.getUsername());
                            }
                        }

                        System.out.print("Enter the number of the candidate you want to vote for: ");
                        int candidateChoice = scanner.nextInt();

                        if (candidateChoice >= 1 && candidateChoice <= candidateCount) {
                            User selectedCandidate = users.stream()
                                    .filter(user -> user instanceof Candidate)
                                    .skip(candidateChoice - 1)
                                    .findFirst()
                                    .orElse(null);

                            if (selectedCandidate != null) {
                                ((Candidate) selectedCandidate).setVote();
                                System.out.println("You have voted for " + selectedCandidate.getUsername() + ".");
                            }
                        } else {
                            System.out.println("Invalid candidate choice.");
                        }

                        voter.vote(); // Menandai bahwa voter telah melakukan vote
                    } else {
                        System.out.println("You have already voted.");
                    }
                } else {
                    System.out.println("Logged in as admin.");
                    
                    List<User> users = DatabaseService.getAllUsers();
                    int voterCount = 0;
                    System.out.println("Voter:");
                    for (User user : users) {
                        if (user instanceof Voter) {
                            voterCount++;
                            System.out.println(voterCount + ". " + user.getName());
                        }
                    }
                    
                    // Voter melakukan login
                    System.out.print("Enter name: ");
                    String voterName = scanner.nextLine();
                    System.out.print("Enter username: ");
                    String voterUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String voterPassword = scanner.nextLine();

                    Voter voter3 = new Voter(voterName, voterUsername, voterPassword);
                    DatabaseService.addUser(voter3);

                    voterCount = 0;
                    users = DatabaseService.getAllUsers();
                    System.out.println("Voter:");
                    for (User user : users) {
                        if (user instanceof Voter) {
                            voterCount++;
                            System.out.println(voterCount + ". " + user.getName());
                        }
                    }
                }
            } else {
                System.out.println("Login failed. Invalid username or password.");
            }

            // Menampilkan hasil voting
            System.out.println("Candidate 1 votes: " + candidate1.getVotes());
            System.out.println("Candidate 2 votes: " + candidate2.getVotes());

            // Memeriksa apakah pengguna ingin mengulang login
            System.out.print("Do you want to login again? (y/n): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("y")) {
                repeatLogin = true;
            }
            // Membersihkan buffer input
            scanner.nextLine();
        } while (repeatLogin);

        scanner.close();
    }

}
