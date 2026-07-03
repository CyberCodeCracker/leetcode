package org.amouri;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        if (n == 0) return new ArrayList<String>();

        List<String> responseArray = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                responseArray.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                responseArray.add("Fizz");
            }
            else if (i % 5 == 0) {
                responseArray.add("Buzz");
            }
            else {
                responseArray.add(Integer.toString(i));
            }

        }
        return responseArray;
    }
}
