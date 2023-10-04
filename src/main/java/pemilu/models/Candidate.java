package pemilu.models;

public class Candidate extends User {
    private int votes;

    public Candidate(String name, String username, String password) {
        super(name, username, password);
        this.votes = 0;
    }

    public void vote() {
        this.votes++;
    }

    public int getVotes() {
        return votes;
    }
}

