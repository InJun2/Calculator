package Calculate;

import java.util.ArrayList;

public class Number {
	private ArrayList<Integer> numlist = new ArrayList<Integer>();
	
	protected Number() {
		
	}
	
	protected Number(String num) throws Exception {
		boolean num_val = valiation_Num(num);
		
		if(num_val==true) {
			setNumber(num);
			
		}
		else {
			throw new Exception("숫자가 아닙니다.");
		}
	}

	protected void setNumber(String number) {
		this.numlist.add(Conversion(number));
	}
	
	protected ArrayList<Integer> getNumber() {
		return this.numlist;
	}

	private boolean valiation_Num(String word) {	
		boolean integerOrNot1 = word.matches("-?\\d+");	
		return integerOrNot1;
	}
	
	private int Conversion(String str) {
		return Integer.parseInt(str);
	}
	
}
