package challenge05;

public class Month {

    /**
     * Write a class named Month. The class should have an int field named monthNumber that
     * holds the number of the month. For example,
     *
     * January would be 1, February would be 2, and so forth. In addition, provide the following
     * methods:
     *      1) A no-arg constructor that sets the monthNumber field to 1.
     *      2) A constructor that accepts the number of the month as an argument. It should set the
     *      monthNumber field to the value passed as the argument. If a value less than 1 or greater
     *      than 12 is assed, the constructor should set monthNumber to 1.
     *      3) A constructor that accepts the name of the month, such as "january" or "Febraury",
     *      as an argument. It should set the monthNumber field to the correct corresponding value.
     *      4) A setMonthNumber method that accepts an int argument, which is assigned to the
     *      monthNumber field. If a value less than 1 or greater than 12 is passed, the method
     *      should set monnthNumber to 1.
     *      5) A getMonthNumber method that returns the value in the monthNumber field.
     *      6) A getMonthName method that returns the name of the month. For example, if the
     *      monthNumber field contains 1, then this method should return "January".
     *      7) A toString method that returns the same value as the getMonthName method.
     *      8) An equals method that accepts a Month object as an argument. If the argument object
     *      holds the same data as the calling object, this method should return true,. Otherwise
     *      it should return false.
     *      9) A greaterThan method that accepts a Month object as an argument. If the calling
     *      object's monthNumber field is greater than the argument's monthNumber field, this
     *      method should return true. Otherwise, it should return false.
     *      10) A lessThan method that accepts a Month object as an argument. If the calling object's
     *      monthNumber field is less than the argument's monthNumber field, this method should
     *      return true. Otherwise, it should return false.
     *
     */

    private int monthNumber;
    private String month;

    public Month(){
        monthNumber = 1;
    }
    public Month(int mn){
        monthNumber = mn;
    }
    public Month(String m){

        if (m.equalsIgnoreCase("January")){
            monthNumber = 1;
        }
        else if (m.equalsIgnoreCase("Febraury")){
            monthNumber = 2;
        }
        else if (m.equalsIgnoreCase("March")){
            monthNumber = 3;
        }
        else if (m.equalsIgnoreCase("April")){
            monthNumber = 4;
        }
        else if (m.equalsIgnoreCase("May")){
            monthNumber = 5;
        }
        else if (m.equalsIgnoreCase("June")){
            monthNumber = 6;
        }
        else if (m.equalsIgnoreCase("July")){
            monthNumber = 7;
        }
        else if (m.equalsIgnoreCase("August")){
            monthNumber = 8;
        }
        else if (m.equalsIgnoreCase("September")){
            monthNumber = 9;
        }
        else if (m.equalsIgnoreCase("Octobar")){
            monthNumber = 10;
        }
        else if (m.equalsIgnoreCase("November")){
            monthNumber = 11;
        }
        else if (m.equalsIgnoreCase("December")){
            monthNumber = 12;
        }


    }
    public void  setMonthNumber(int mn){
        if (mn >= 1 && mn <= 12){
            monthNumber = mn;
        }else {
            monthNumber = 1;
        }

    }
    public int getMonthNumber(){
        return monthNumber;
    }
    public String getMonthName(){

         switch (monthNumber){
             case 1:
                 return "January";
             case 2:
                 return "Febraury";
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
             default:
                 return "January";
         }


    }

    public String toString() {
        return getMonthName();
    }
    public boolean equals(Month obj){

        return obj.monthNumber == this.monthNumber;
    }
    public boolean greaterThan(Month obj){
        return this.monthNumber > obj.monthNumber;

    }
    public boolean lessThan(Month obj){
        return this.monthNumber < obj.monthNumber;

    }

    public static void main(String[] args) {

        Month month1 = new Month(1);
        Month month2 = new Month(2);

        System.out.println(month1.lessThan(month2));



    }



}
