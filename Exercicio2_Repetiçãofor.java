package la�oderepeti��o;

import java.util.Scanner;

public class Exercicio2_Repeti��ofor {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int num=1;
		int par=0;
		int impar=0;
		
		for(int i = 1; i<=10;i++) {
		System.out.println("Digite um n�mero: ");
		num = leia.nextInt();
		
		if (num%2!=0) {
			impar++;
		}
		else if(num%2 == 0) {
		     par++;
		}
		}
		System.out.println("Quatidade de impares s�o(�) "+ impar+" e de pares s�o(�) "+par);
		
		leia.close();
		}
}
