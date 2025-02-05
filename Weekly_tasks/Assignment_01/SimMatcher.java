package assignment31;

import java.util.Arrays;
import java.util.Comparator;

public class SimMatcher {

    public static SimData[] matchAndSort(SimData[] sims, String search_circle, double search_rate) {
        
        return Arrays.stream(sims)
                .filter(sim -> sim.getCircle().equals(search_circle) && sim.getRatePerSecond() < search_rate)
                .sorted(Comparator.comparingInt(SimData::getBalance).reversed())
                .toArray(SimData[]::new);
    }

    public static void main(String[] args) {
       
        SimData[] sims = new SimData[4];
        sims[0] = new SimData(1, "jio", 430, 1.32, "mumbai");
        sims[1] = new SimData(2, "idea", 320, 2.26, "mumbai");
        sims[2] = new SimData(3, "airtel", 500, 2.54, "mumbai");
        sims[3] = new SimData(4, "vodafone", 640, 3.21, "mumbai");

        String search_circle = "mumbai";
        double search_rate = 3.4;

       
        SimData[] result = matchAndSort(sims, search_circle, search_rate);

       
        for (SimData sim : result) {
            System.out.println(sim.getId());
        }
    }
}

