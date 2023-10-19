import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        String input = "IV";
        int result = 0;
        int prevValue = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(input.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        System.out.println("Integer value of " + input + " is: " + result);
    }
}

