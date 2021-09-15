package Calculate;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Oper {	// 아직 쓰는법 자세히 모르겠음

	 private static Map<String, BiFunction<Integer, Integer, Integer>> operators = new HashMap<>();
	 
	 static {
         operators.put("+", (num1, num2) -> num1 + num2);
         operators.put("-", (num1, num2) -> num1 - num2);
         operators.put("*", (num1, num2) -> num1 * num2);
         operators.put("/", (num1, num2) -> num1 / num2);
     }

     public static int calculate(String operator, int num1, int num2) {
         return operators.get(operator).apply(num1, num2);
     }

}
