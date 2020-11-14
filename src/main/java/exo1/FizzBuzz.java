package main.java.exo1;

public class FizzBuzz {

    public String getResult(int i) {
        if(i % 3 == 0)
            return "Fizz";
        if (i ==5)
            return "Buzz";

      return String.valueOf(i);
    }
}
