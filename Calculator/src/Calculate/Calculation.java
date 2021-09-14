package Calculate;

import java.util.ArrayList;

public class Calculation {
	private final String MULTIPLY = "*";
	private final String PLUS = "+";
	private final String MINUS = "-";

	private ArrayList<Integer> numlist;
	private ArrayList<String> operlist;

	private int result = 0;

	protected Calculation(Number num, Operator oper) {
		numlist = num.getNumber();
		operlist = oper.getOperator();

		Multiplication();
		Addition();
		Subtraction();

		result = numlist.get(0);

		Output.print("계산된 결과는 "+result+" 입니다.");

	}

	private void Multiplication() {
		for (int i = 0; i < operlist.size(); i++) {
			if (MULTIPLY.equals(operlist.get(i))) {
				int multi = numlist.get(i) * numlist.get(i + 1);
				numlist.remove(i + 1);
				numlist.remove(i);
				numlist.add(i, multi);
				operlist.remove(i);
			}
		}

	}

	private void Addition() {
		for (int i = 0; i < operlist.size(); i++) {
			if (PLUS.equals(operlist.get(i))) {
				int plus = numlist.get(i) + numlist.get(i + 1);
				numlist.remove(i + 1);
				numlist.remove(i);
				numlist.add(i, plus);
				operlist.remove(i);
			}
		}
	}

	private void Subtraction() {
		for (int i = 0; i < operlist.size(); i++) {
			if (MINUS.equals(operlist.get(i))) {
				int minus = numlist.get(i) - numlist.get(i + 1);
				numlist.remove(i + 1);
				numlist.remove(i);
				numlist.add(i, minus);
				operlist.remove(i);
			}
		}
	}

}
