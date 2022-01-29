package challenge_01;

/**

 Please check out my youtube channel to see
 the solutions to all the programming challenges in this book.
 the linke is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 or look up my youtube channel name "The Blind Programmer"
 *
 *
 *
 */
public class Main {

    public static void main(String[] args) {

        try{

            int[] testScores = {99, 88, 77, 77};

            TestScores ts = new TestScores(testScores);
            System.out.println("Average: " + ts.getAverage());


        }catch (NegativeTestScore e1){
            System.out.println(e1.getMessage());
        }catch (GreaterThanHunderend e2){
            System.out.println(e2.getMessage());
        }



    }
}
