package challenge_8_7;

public class WordNumber {

    private  String [] numbers = {

            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"

    };

    // all the methods
    public  String getThousands(int num){

        String result = "";


        int thousand = num/1000;
        int hundrend = (num % 1000);

        switch (thousand){

            case 1:
                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;

            case 2:
                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;

            case 3:

                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;

            case 4:

                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;

            case 5:

                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;

            case 6:

                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;

            case 7:

                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;

            case 8:
                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);

                break;

            case 9:
                result += numbers[thousand] + " thousand " + getTwos(hundrend/100)
                        + " hundrend " + getTwos((num % 1000) % 100);
                break;


            default:
        }

        return result;
    }
    public  String getHundrends(int num ){
        String result = "";

        switch (num/100){

            case 1:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 2:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 3:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 4:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 5:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 6:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 7:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 8:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;

            case 9:
                result += numbers[ num/100] +" hundrend " + getTwos((num % 100));
                break;



            default:
        }

        return result;
    }
    public  String getTwos(int num){

        String result = "";

        switch (num){

            case 10:
                result += " ten ";
                break;

            case 11:
                result += " eleven ";
                break;

            case 12:
                result += " twelve ";
                break;

            case 13:
                result += " thirteen ";
                break;

            case 14:
                result += " fourteen ";
                break;

            case 15:
                result += " fifteen ";
                break;

            case 16:
                result += " sixteen ";
                break;

            case 17:
                result += " seventeen ";
                break;

            case 18:
                result += " eighteen ";
                break;

            case 19:
                result += " nineteen ";
                break;

            default:
        }
        if (num >= 1 && num <= 10){

            switch (num){

                case 0:
                    result += "";
                    break;

                case 1:
                    result += " one ";
                    break;

                case 2:
                    result += " two ";
                    break;

                case 3:
                    result += " three ";
                    break;
                case 4:
                    result += " four ";
                    break;
                case 5:
                    result += " five ";
                    break;
                case 6:
                    result += " six ";
                    break;
                case 7:
                    result += " seven ";
                    break;

                case 8:
                    result += " eight ";
                    break;
                case 9:
                    result += " nine ";
                    break;

                default:
            }

        }

        switch (num/10){

            case 2:
                result += " twenty " + getOnes(num % 10);
                break;

            case 3:
                result += " thirty "+ getOnes(num % 10);
                break;

            case 4:
                result += " fourty "+ getOnes(num % 10);
                break;

            case 5:
                result += " fifty "+ getOnes(num % 10);
                break;

            case 6:
                result += " sixty "+ getOnes(num % 10);
                break;

            case 7:
                result += " seventy "+ getOnes(num % 10);
                break;

            case 8:
                result += " eighty "+ getOnes(num % 10);
                break;

            case 9:
                result += " ninety "+ getOnes(num % 10);
                break;

            default:
        }

        return result;
    }
    public  String getOnes(int num){

        String result = "";

        switch (num){

            case 0:
                result += "";
                break;

            case 1:
                result += " one ";
                break;

            case 2:
                result += " two ";
                break;

            case 3:
                result += " three ";
                break;
            case 4:
                result += " four ";
                break;
            case 5:
                result += " five ";
                break;
            case 6:
                result += " six ";
                break;
            case 7:
                result += " seven ";
                break;

            case 8:
                result += " eight ";
                break;

            case 9:
                result += " nine ";
                break;

            default:


        }

        return result;
    }
}
