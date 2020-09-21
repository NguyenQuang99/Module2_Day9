package FizzBuzz;

public class FizzBuzzTranslate {


    public static String FizzBuzz(int number) {

        if(number <= 0) {
            return "Khong";
        } else  {
            if(number % 3 == 0 && number % 5 != 0) {
                return "Fizz";
            } else if(number % 5 == 0 && number % 3 != 0) {
                return "Buzz";
            } else if(number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else {
                return String.valueOf(number);


            }


        }


    }
}