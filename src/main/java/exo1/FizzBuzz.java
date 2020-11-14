package main.java.exo1;

public class FizzBuzz {

    public String getResult(int i) {
        if(i % 15 == 0)
            return "FizzBuzz";
        if(i % 5 == 0)
            return "Buzz";
        if(i % 3 == 0)
            return "Fizz";

      return String.valueOf(i);
    }
}
