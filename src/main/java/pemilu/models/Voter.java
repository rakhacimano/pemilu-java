package pemilu.models;

public class Voter extends User {
    private boolean hasVoted;

    public Voter(String name, String username, String password) {
        super(name, username, password);
        this.hasVoted = false;
    }

    public boolean vote() {
        if (!hasVoted) {
            hasVoted = true;
            return true;
        }
        return false;
    }

    public boolean hasVoted() {
        return hasVoted;
    }
}

