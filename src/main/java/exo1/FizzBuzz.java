package main.java.exo1;

public class FizzBuzz {

    public String getResult(int i) {
        if (i ==5)
            return "Buzz";
        if(i == 3)
            return "Fizz";

      return String.valueOf(i);
    }
}
