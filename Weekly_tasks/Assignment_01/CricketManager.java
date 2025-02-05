package assignment31;

import java.util.Scanner;

public class CricketManager {

   
    public static double[] findAverageOfRuns(CricketPlayer[] players, int target) {
        int count = 0;

        
        for (CricketPlayer player : players) {
            if (player.getMatchesPlayed() <= target) {
                count++;
            }
        }

        double[] averages = new double[count];
        int index = 0;

        
        for (CricketPlayer player : players) {
            if (player.getMatchesPlayed() <= target) {
                double averageRuns = (double) player.getRunsScored() / player.getMatchesPlayed();
                averages[index++] = averageRuns;
            }
        }

        return averages;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        CricketPlayer[] players = new CricketPlayer[4];

        for (int i = 0; i < 4; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int iccRank = scanner.nextInt();
            int matchesPlayed = scanner.nextInt();
            int runsScored = scanner.nextInt();
            players[i] = new CricketPlayer(id, name, iccRank, matchesPlayed, runsScored);
        }

        
        int target = scanner.nextInt();

       
        double[] averages = findAverageOfRuns(players, target);

       
        for (double averageRun : averages) {
            if (averageRun >= 80) {
                System.out.println("Grade A");
            } else if (averageRun >= 50 && averageRun < 80) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }

        
        scanner.close();
    }
}
