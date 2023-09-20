import java.util.ArrayList;
import java.util.List;

class Team {
    private String teamName;
    private String motto;
    private List<Player> players;
    private String stadium;
    private Coach coach;

    public Team(String teamName, String motto, String stadium, Coach coach) {
        this.teamName = teamName;
        this.motto = motto;
        this.players = new ArrayList<>();
        this.stadium = stadium;
        this.coach = coach;
    }

    public void setSquad(List<Player> startingXI, List<Player> reserves) {
        // Set the starting XI and reserves
        // Implement your logic here
    }

    public void train(Training training) {
        // Choose training sessions from the Training class
        // Implement your logic here
    }

    public void playMatch() {
        // Simulate a match using the selected squad
        // Implement your logic here
    }
}

class Player {
    private String name;
    private String dob;
    private String dominantFoot;
    private double height;
    private double weight;
    private String injuryProfile;
    private String position;
    private boolean isFit;

    public Player(String name, String dob, String dominantFoot, double height, double weight, String injuryProfile, String position, boolean isFit) {
        this.name = name;
        this.dob = dob;
        this.dominantFoot = dominantFoot;
        this.height = height;
        this.weight = weight;
        this.injuryProfile = injuryProfile;
        this.position = position;
        this.isFit = isFit;
    }

    public void warmUp(Training training) {
        // Implement warm-up logic here
    }

    public void playMatch() {
        // Implement playing a match logic here
    }
}

class Training {
    public void warmUp(Player player) {
        // Implement warm-up for a player here
    }

    public void practicePenalties(Player player) {
        // Implement penalty practice for a player here
    }

    public void practiceFreeKicks(Player player) {
        // Implement free-kick practice for a player here
    }

    public void practiceOffsideTrap(Player player) {
        // Implement offside trap practice for a player here
    }

    public void jog(Player player) {
        // Implement jogging for a player here
    }

    public void pushUp(Player player) {
        // Implement push-ups for a player here
    }
}

class Captain extends Player {
    public Captain(String name, String dob, String dominantFoot, double height, double weight, String injuryProfile, String position, boolean isFit) {
        super(name, dob, dominantFoot, height, weight, injuryProfile, position, isFit);
    }

    public void pepTalk() {
        // Motivate the team
        // Implement your pep talk logic here
    }

    public void selectSide() {
        // Tossing before the game
        // Implement side selection logic here
    }
}

class Coach extends Strategy {
    public Coach(String name) {
        super(name);
    }

    public void motivateTeam() {
        // Motivate the team (private method)
        // Implement your motivation logic here
    }
}

class Strategy {
    private String name;

    public Strategy(String name) {
        this.name = name;
    }

    public void selectSquad(Team team) {
        // Implement squad selection logic here
    }

    public void setFormation(Team team) {
        // Implement formation setting logic here
    }

    public void changeFormation(Team team) {
        // Implement formation change logic here
    }

    public void makeSubstitution(Team team) {
        // Implement substitution logic here
    }
}




public class Main {
    public static void main(String[] arrgs) {
        // I am yet to create instances/objects of these classes.

        }
    }
