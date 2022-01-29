package challenge_02;

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

        try {

            TestScoreCustomException ts = new
                    TestScoreCustomException(new int[]{88,77,68, 55});

            System.out.println("Avg: " + ts.getAverage());

        }catch (InvalidTestScore e){
            System.out.println(e.getMessage());
        }


    }
}
