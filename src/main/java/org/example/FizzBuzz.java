package org.example;

public class FizzBuzz {
    public String doFizzBuzz(int nombre){
        if(nombre % 3 == 0  && nombre % 5 == 0){
            return "FizzBuzz";
        }
        if(nombre % 3 == 0){
            return "Fizz";
        }
        if (nombre % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(nombre);
        /*return nombre % 3 == 0 ? "Fizz" : "";*/

    }
}
