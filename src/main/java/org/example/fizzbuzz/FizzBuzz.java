package org.example.fizzbuzz;

public class FizzBuzz {

    public static void main(String...args) {
    	System.out.println(" ");
        System.out.println("============================================");
        for (int i = 1; i < 101; i++){

            String fizzBuzz = fizzbuzz(i);
            
            if (i < 100){
                System.out.print (fizzBuzz + ", ");
            }else{
                 System.out.print (fizzBuzz);
                 System.out.println(" ");
                 System.out.println("============================================");
            }
           

        }
    }

    public static String fizzbuzz(int number) {
    	//Regel 5 & 3
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        else
        //Regel 3
        if (number % 3 == 0){
            return "Fizz";

        }
        else
        //Regel 5
        if (number % 5 == 0){
            return "Buzz";

        }
        else{ 
        //erste Regel
        
        return Integer.toString(number);
        }
    }
}
