package challenge_04;

public class Month {

    private int monthNumber;
    private String monthName;


//    public Month(){
//        this.monthNumber = 1;
//    }
//

    public Month(String month){

        switch (month){
            case "January":
                this.monthNumber=1;
                break;
            case "February":
                this.monthNumber=2;
                break;

            case "March":
                this.monthNumber=3;
                break;

            case "April":
                this.monthNumber=4;
                break;

            case "May":
                this.monthNumber=5;
                break;

            case "June":
                this.monthNumber=6;
                break;

            case "July":
                this.monthNumber=7;
                break;

            case "August":
                this.monthNumber=8;
                break;

            case "September":
                this.monthNumber=9;
                break;

            case "Octobar":
                this.monthNumber=10;
                break;

            case "November":
                this.monthNumber=11;
                break;

            case "December":
                this.monthNumber=12;
                break;


        }

    }

    public Month(int mn){
        this.monthNumber=mn;
    }

    public int getMonthNumber() {
        return monthNumber;
    }


    /**
     * setMonthNumber -> exception
     * @param monthNumber
     */
    public void setMonthNumber(int monthNumber) throws LessThan, GreaterThan{

        /**
         * Check if monthNumber is NEGATIVE
         *    throw LessThan(monthNumber)
         * Check if monthNumber > 12
         *    throw GreaterThan(monthNumber)
         *
         */
        if (monthNumber < 0){
            throw new LessThan(monthNumber);
        }
        else if (monthNumber > 12){
            throw new GreaterThan(monthNumber);
        }

        if (monthNumber >= 1 && monthNumber <= 12){
            this.monthNumber=monthNumber;
        }

    }

    /**
     * setMonthName -> check exceptions
     * @param mn
     *
     */
    public void setMonthName(String mn) throws InvalidMonth  {

        /**
         *  if getMonthName is NOT equal to mn passed
         *  throw InvalidMonth(mn)
         */
        if (!getMonthName().equalsIgnoreCase(mn)){
            throw new InvalidMonth(mn);
        }else {
            this.monthName=mn;
        }

    }

    public String getMonthName() {


        switch (monthNumber){

            case 1:
                return "January";

            case 2:
                return "February";


            case 3:
                return "March";

            case 4:
                return "April";


            case 5:
                return "May";


            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "Octobar";


            case 11:
                return "November";

            case 12:
                return "December";

        }

        return "";
    }

    @Override
    public String toString() {

        return monthName;
    }

    public boolean equals(Month month){

       return month.getMonthNumber()==this.getMonthNumber();
    }

    public boolean isGreaterThan(Month month){

        return month.getMonthNumber() < this.getMonthNumber();
    }

    public boolean isLessThan(Month month){
        return month.getMonthNumber() > this.getMonthNumber();
    }



}
