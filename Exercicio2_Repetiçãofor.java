package laçoderepetição;

import java.util.Scanner;

public class Exercicio2_Repetiçãofor {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int num=1;
		int par=0;
		int impar=0;
		
		for(int i = 1; i<=10;i++) {
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if (num%2!=0) {
			impar++;
		}
		else if(num%2 == 0) {
		     par++;
		}
		}
		System.out.println("Quatidade de impares são(é) "+ impar+" e de pares são(é) "+par);
		
		leia.close();
		}
}
