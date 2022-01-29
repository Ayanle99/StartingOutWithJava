package challenge_03;

import challenge_01.ProductionWorker;


/**
 *
 * Please subscribe to my youtube channel
 * for more programming challenges' tutorials.
 * The youtube link is: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or lookup the name 'The Blind Programmer on youtube.
 *
 */
public class TeamLeader extends ProductionWorker {

    private double monthlyBonus;
    private int reqTrainingHours;
    private int trainingHoursAttended;

    public TeamLeader(String name, String empNumber, String hireDate, int shift, double payRate, double monthlyBonus,
                      int reqTrainingHours, int trainingHoursAttended) {
        super(name, empNumber, hireDate, shift, payRate);

        this.monthlyBonus = monthlyBonus;

        if (trainingHoursAttended < 0){
            System.out.println("Error: training hrs cannot be negative.");
            System.exit(0);
        }else {
            this.trainingHoursAttended = trainingHoursAttended;
        }

        if (reqTrainingHours < 0){
            System.out.println("Error: required training canot be negative.");
            System.exit(0);
        }else {
            this.reqTrainingHours = reqTrainingHours;
        }

    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public int getReqTrainingHours() {
        return reqTrainingHours;
    }

    public void setReqTrainingHours(int reqTrainingHours) {

        if (reqTrainingHours < 0){
            System.out.println("Error: req training cannot be negqtive.");
            System.exit(0);
        }else {
            this.reqTrainingHours = reqTrainingHours;
        }
    }

    public int getTrainingHoursAttended() {
        return trainingHoursAttended;
    }

    public void setTrainingHoursAttended(int trainingHoursAttended) {

        if (trainingHoursAttended < 0){
            System.out.println("Error: training cannot be negative.");
            System.exit(0);
        }else {
            this.trainingHoursAttended = trainingHoursAttended;
        }
    }

    public static void main(String[] args) {


        TeamLeader tl = new TeamLeader(

                "Mike",
                "123-AC",
                "01/01/1988",
                1,
                30,
                200,
                10,
                2
        );

        System.out.println("Team Leader info");
        System.out.println("\t - Name: " + tl.getEmpName()
        +"\n\t - Emp #: " + tl.getEmpNumber()
        +"\n\t - Emp hire date: " + tl.getHireDate()
        +"\n\t - Emp shift: " + ((tl.getShift() == 1) || (tl.getShift() == 2) ? "Day" : "Night" )
        +"\n\t - Emp pay rate: $" + tl.getPayRate()
        +"\n\t - EMp monthly bonus: $" + tl.getMonthlyBonus()
        +"\n\t - Emp required training hrs: " + tl.getReqTrainingHours()
        +"\n\t - Emp training hrs attended: " + tl.getTrainingHoursAttended());




    }
}
