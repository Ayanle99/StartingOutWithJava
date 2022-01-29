package challenge20;


public class CoinSimulatorRunner {


    public static void main(String[] args) {

        CoinTossSimulator coin = new CoinTossSimulator();

        String sideUp = coin.getSideUp();

        System.out.println("Initial sideUp: " + sideUp);

        System.out.println();

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < 20; i++){
            CoinTossSimulator coinTossSimulator = new CoinTossSimulator();
            sideUp = coinTossSimulator.getSideUp();

            if (sideUp.equalsIgnoreCase("heads")){
                headsCount++;
                System.out.println(String.valueOf(i) + "\t\t" + sideUp);
            }
            if (sideUp.equalsIgnoreCase("tails")){
                tailsCount++;
                System.out.println(String.valueOf(i) + "\t\t" + sideUp);
            }
        }

        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);




    }


}
