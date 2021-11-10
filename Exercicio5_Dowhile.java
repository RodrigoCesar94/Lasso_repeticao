package laçoderepetição;

import java.util.Scanner;

public class Exercicio5_Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
	    
		int soma=0, num;
	   
		do{
			System.out.println("Digite um numero do teclado: ");
	        num=leia.nextInt();
	        soma=soma+num;
	        }
		while (num!=0);
		
		System.out.println("soma dos números, antes de digitar zero: "+soma);
		leia.close();
		
            }
}
