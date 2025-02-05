package assignment31;

public class PlayerManager {

    
    public static int findPointsForGivenSkill(Player[] players, String skill) {
        int totalPoints = 0;
        
        
        for (Player player : players) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                totalPoints += player.getPoints();
            }
        }
        
        return totalPoints; 
    }

   
    public static Player getPlayerBasedOnLevel(String level, String skill, Player[] players) {
        for (Player player : players) {
            if (player.getLevel().equalsIgnoreCase(level) && 
                player.getSkill().equalsIgnoreCase(skill) && 
                player.getPoints() >= 20) {
                return player; 
            }
        }
        return null; 
    }

    public static void main(String[] args) {
       
        Player[] players = {
            new Player(1, "Soccer", "Intermediate", 30),
            new Player(2, "Basketball", "Beginner", 15),
            new Player(3, "Tennis", "Advanced", 25),
            new Player(4, "Soccer", "Beginner", 10),
            new Player(5, "Basketball", "Intermediate", 22)
        };

        
        String skillToSearch = "soccer";
        int totalPoints = findPointsForGivenSkill(players, skillToSearch);
        System.out.println("Total points for skill " + skillToSearch + ": " + totalPoints);

        
        String levelToSearch = "Intermediate";
        String skillToSearchLevel = "Basketball";
        Player foundPlayer = getPlayerBasedOnLevel(levelToSearch, skillToSearchLevel, players);
        if (foundPlayer != null) {
            System.out.println("Player found: ID = " + foundPlayer.getPlayerId() + 
                               ", Skill = " + foundPlayer.getSkill() + 
                               ", Level = " + foundPlayer.getLevel() + 
                               ", Points = " + foundPlayer.getPoints());
        } else {
            System.out.println("No player found with the given level and skill.");
        }
    }
}

