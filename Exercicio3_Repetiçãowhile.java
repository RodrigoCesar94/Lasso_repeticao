package laçoderepetição;

import java.util.Scanner;

public class Exercicio3_Repetiçãowhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, mais50=0, menos21=0, total99=0;

		
	    
		while(total99> -99) {
	    System.out.println("Digite idade: ");
		idade = leia.nextInt();	
	    total99=total99-idade;
	    
		if(idade<21) {
		menos21++;	
		}
		else if(idade>50) {
		mais50++;
		}
		
		}
		System.out.println("Quantidade +50 anos: "+mais50+"\nQuantidade <21 anos: "+menos21);
        leia.close();
		}
	
	

}
