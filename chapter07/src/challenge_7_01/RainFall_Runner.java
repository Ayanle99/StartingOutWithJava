package challenge_7_01;

/**
 * Please subscribe to my youtube channel to
 * see more tutorials. The channel link is:
 * https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 *
 * or lookup 'The Blind Programmer' on youtube.
 */

public class RainFall_Runner {

    public static void main(String[] args) {


        RainfallClass rainfallClass = new RainfallClass();

        double totalRainfall = rainfallClass.getTotalRainfall();
        double avgRainfall = rainfallClass.averageMonthlyRainfall();
        double mostRainfall = rainfallClass.mostRain();
        double leastRainfall = rainfallClass.leastRain();

        System.out.println("Rainfall Info");

        System.out.println("Total Rainfall: " + totalRainfall
        +"\nAverage rainfall: " +avgRainfall
        +"\nMost rainfall: " + mostRainfall
        +"\nLeast rainfall: " + leastRainfall);


    }
}
