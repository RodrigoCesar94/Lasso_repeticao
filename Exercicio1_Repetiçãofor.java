package laçoderepetição;

public class Exercicio1_Repetiçãofor {

	public static void main(String[] args) {
		
		int div11;
		
		for(int i = 1000; i<=1999 ;i++) {
		
		div11=i%11;
		
		if(div11==5) {
				System.out.println(i);
			}
		}

	}

}
