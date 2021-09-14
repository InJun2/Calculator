package Calculate;

import java.util.ArrayList;

public class Separation {

	protected Separation(String word, Number num, Operator oper) {
		String_Separtion(word,num,oper);
	}



	private void String_Separtion(String word, Number num, Operator oper) {
		String section[] = Split(word);
		for(int i=0;i<section.length;i++) {
			if(i%2==0) {
				num.setNumber(section[i]);
			}
			if(i%2==1) {
				oper.setOperator(section[i]);
			}
		}
	}
	
	private String[] Split(String str) {
		String word[] = str.split("\\s");
		return word;
	}
	
}
