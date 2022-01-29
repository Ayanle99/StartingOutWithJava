package challenge_04;

public class Essay extends GradeActivity{

    /**
     *     Grammar: 30 points
     *     Spelling: 20 points
     *     Correct length: 20 points
     *     Content: 30 points
     */
    private final int GRAMMER_POINTS = 30;
    private final int SPELLING_POINTS = 20;
    private final int CONTENT_LENGTH = 20;
    private final int CONTENT = 30;


    private int grammerPoints;
    private int spellingPoints;
    private int contentLengthPoints;
    private int contentPoints;

    public int getGrammerPoints() {
        return grammerPoints;
    }

    public void setGrammerPoints(int grammerPoints) {
        this.grammerPoints = grammerPoints;
    }

    public int getSpellingPoints() {
        return spellingPoints;
    }

    public void setSpellingPoints(int spellingPoints) {
        this.spellingPoints = spellingPoints;
    }

    public int getContentLengthPoints() {
        return contentLengthPoints;
    }

    public void setContentLengthPoints(int contentLengthPoints) {
        this.contentLengthPoints = contentLengthPoints;
    }

    public int getContentPoints() {
        return contentPoints;
    }

    public void setContentPoints(int contentPoints) {
        this.contentPoints = contentPoints;
    }

    public Essay(double score, int grammerPoints, int spellingPoints, int contentLengthPoints, int contentPoints) {
        super(score);

        if (grammerPoints > 30){
            System.out.println("Error: grammer points can only be (0-30)");
            System.exit(0);
        }else {
            this.grammerPoints = grammerPoints;
        }

        if (spellingPoints > 20){
            System.out.println("Error: spelling points can only be (0-20)");
            System.exit(0);
        }else {
            this.spellingPoints = spellingPoints;
        }

        if (contentLengthPoints > 30){
            System.out.println("Error: contentLength points can only be (0-20)");
            System.exit(0);
        }else {
            this.contentLengthPoints = contentLengthPoints;
        }

        if (contentPoints > 30){
            System.out.println("Error: content points can only be (0-30)");
            System.exit(0);
        }else {
            this.contentPoints = contentPoints;
        }

    }

    public static void main(String[] args) {

        Essay essay = new Essay(40, 20, 20, 20, 20); // 100

        System.out.println("Grade: " + essay.getGrade());
    }



}
