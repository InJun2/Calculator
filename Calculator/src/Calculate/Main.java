package Calculate;
	

public class Main {
	public static void main(String[] args) {
		Number num = new Number();
		Operator oper = new Operator();
		
		String word = Input.input();
		
		new Separation(word,num,oper);
		new Calculation(num,oper);
		
		
	}

}
