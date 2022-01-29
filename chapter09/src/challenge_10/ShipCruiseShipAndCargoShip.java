package challenge_10;

/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */

public class ShipCruiseShipAndCargoShip {


    public static void main(String[] args) {


        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Container Ship", "1909");
        ships[1] = new CruiseShip("CruiseShip", "1955",
                40);
        ships[2] = new CargoShip("CargoShip", "2002",
                98);

        for (Ship ship : ships){
            System.out.println(ship.toString());
        }


    }



}
