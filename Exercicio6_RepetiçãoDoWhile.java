package laçoderepetição;

import java.util.Scanner;

public class Exercicio6_RepetiçãoDoWhile {

	public static void main(String[] args) {
		
		
Scanner leia = new Scanner(System.in);
	    
		int soma=0, num, media=0;
	   
		do{
			System.out.println("Digite um numero do teclado: ");
	        num=leia.nextInt();
	     
	     if (num!=0 && num%3 == 0) {/*se "num" é diferente de zero e restodivisão por 3 é zero,
	     enão preciso: somar, incrementar o valor de num e achar a média.*/ 	 
	     soma=soma+num;
	     num++;
		 media=soma/(num-1);/*Aqui, o incremento de "num"após inserir zero 
		 é subtraído, pois zero é o comando para encerrar o programa e não 
		 deve ser conjtado como +1 no num, isso iria distorcer as médias*/
	      
	     }
	     
	     
	     if(num == 0) {
		 System.out.println("Você encerrou o programa");
		 System.out.println("Média dos multiplos de 3"+"\nantes de você digitar zero: "+media);
		 leia.close();
	     }
		
		
		}
		while (num!=0);

	}

}
