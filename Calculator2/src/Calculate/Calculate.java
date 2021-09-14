package Calculate;

import java.util.ArrayList;
import java.util.List;

public class Calculate {
	
	private List<String> opers = new ArrayList<>();
	private List<Integer> numbers = new ArrayList<>();
	
	private final String MULTIPLY = "*";
	private final String PLUS = "+";
	private final String MINUS = "-";
	
	
	protected Calculate(Numbers numbers, Operators opers) {
		this.opers = opers.getOperators();
		this.numbers = numbers.getNumbers();
		multiplication();
		addition();
		subtraction();
		Output.print("계산된 결과는 "+this.numbers.get(0) + "입니다");
		
	}
	
	
	private void multiplication() {
		for (int i = 0; i < opers.size(); i++) {
			if (MULTIPLY.equals(opers.get(i))) {
				numbers.set(i, numbers.get(i) * numbers.get(i + 1));
				numbers.remove(i + 1);
				opers.remove(i);
			}
		}

	}

	private void addition() {
		for (int i = 0; i < opers.size(); i++) {
			if (PLUS.equals(opers.get(i))) {
				numbers.set(i, numbers.get(i) + numbers.get(i + 1));
				numbers.remove(i + 1);
				opers.remove(i);
			}
		}
	}

	private void subtraction() {
		for (int i = 0; i < opers.size(); i++) {
			if (MINUS.equals(opers.get(i))) {
				numbers.set(i, numbers.get(i) - numbers.get(i + 1));
				numbers.remove(i + 1);
				opers.remove(i);
			}
		}
	}
}
