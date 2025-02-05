package assignment31;

import java.util.Arrays;
import java.util.Comparator;

public class SimTransfer {

    public static SimDetails[] transferCircle(SimDetails[] sims, String circle1, String circle2) {
        
        return Arrays.stream(sims)
                .filter(sim -> sim.getCircle().equals(circle1))
                .peek(sim -> sim.setCircle(circle2))  
                .sorted(Comparator.comparingDouble(SimDetails::getRatePerSecond).reversed()) // Sort by ratePerSecond in descending order
                .toArray(SimDetails[]::new);
    }

    public static void main(String[] args) {
       
        SimDetails[] sims = new SimDetails[5];
        sims[0] = new SimDetails(1, "raju", 130, 1.32, "mum");
        sims[1] = new SimDetails(2, "sachin", 120, 2.26, "ahd");
        sims[2] = new SimDetails(3, "ram", 200, 2.54, "kol");
        sims[3] = new SimDetails(4, "shubham", 640, 3.21, "ahd");
        sims[4] = new SimDetails(5, "kalpesh", 150, 1.8, "ahd");

        String circle1 = "ahd";
        String circle2 = "kol";

        
        SimDetails[] result = transferCircle(sims, circle1, circle2);

        
        for (SimDetails sim : result) {
            System.out.println(sim);
        }
    }
}
