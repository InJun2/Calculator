package Calculate;

import java.util.ArrayList;
import java.util.List;

public class Number {
	private int num;
	
	protected Number() {
		
	}
	
	protected Number(String num, Numbers numbers) {	
		valiation_Num(num);
		this.num = Conversion(num);
		numbers.setNumbers(this.num);
	}

	protected void setNumber(String number) {
		this.num = Conversion(number);
	}
	
	protected int getNumber() {
		return this.num;
	}

	private void valiation_Num(String word) {	
		boolean integerOrNot = word.matches("-?\\d+");	
		if(!integerOrNot) {
			throw new RuntimeException("�߸��� ����");
		}
	}
	
	private int Conversion(String str) {
		return Integer.parseInt(str);
	}
	
}
