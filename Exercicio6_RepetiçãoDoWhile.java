package la�oderepeti��o;

import java.util.Scanner;

public class Exercicio6_Repeti��oDoWhile {

	public static void main(String[] args) {
		
		
Scanner leia = new Scanner(System.in);
	    
		int soma=0, num, media=0;
	   
		do{
			System.out.println("Digite um numero do teclado: ");
	        num=leia.nextInt();
	     
	     if (num!=0 && num%3 == 0) {/*se "num" � diferente de zero e restodivis�o por 3 � zero,
	     en�o preciso: somar, incrementar o valor de num e achar a m�dia.*/ 	 
	     soma=soma+num;
	     num++;
		 media=soma/(num-1);/*Aqui, o incremento de "num"ap�s inserir zero 
		 � subtra�do, pois zero � o comando para encerrar o programa e n�o 
		 deve ser conjtado como +1 no num, isso iria distorcer as m�dias*/
	      
	     }
	     
	     
	     if(num == 0) {
		 System.out.println("Voc� encerrou o programa");
		 System.out.println("M�dia dos multiplos de 3"+"\nantes de voc� digitar zero: "+media);
		 leia.close();
	     }
		
		
		}
		while (num!=0);

	}

}
