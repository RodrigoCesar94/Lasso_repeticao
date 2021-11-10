package laçoderepetição;

import java.util.Scanner;

public class Exercicio4_While {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, temperamento, hab=150, i=0, pcalmas = 0, maiorde40n = 0, menor18c = 0,
		mulhernervosa=0, homemagressivo=0, outroscalmos=0;
		
		while(i<hab) {
	    System.out.println("Digite sua idade: ");
	    idade = leia.nextInt();
	    
	    System.out.println("Sexo: 1 para Masculino, 2 Feminino, 3 Outros: ");
	    sexo = leia.nextInt();
	    
	    System.out.println("Você é uma pessoa: 1 - calma, 2 - nervosa ou 3-agressiva: " );
	    temperamento=leia.nextInt();
	    
	    if(temperamento == 1) {
	    pcalmas++;
	    }  
	    if(sexo == 2 && temperamento == 2) {
	    mulhernervosa++;//numero de pessoas mulheres e nervosas = mulhernervosa.
	    }
	    if(sexo == 1 && temperamento == 3) {
	    homemagressivo++;//homem agressivo
	    }
	    if(sexo == 3 && temperamento == 1) {
	    outroscalmos++;
	    }
	    if(idade > 40 && temperamento ==2) {
	    maiorde40n++;	
	    }
	    if (idade<18 && temperamento == 1) {
	    menor18c++;
	    }
	    i++;
	    }
	    System.out.println("Nº de pessoas calmas: "+pcalmas);	
	    System.out.println("Nº de mulheres nervosas: "+mulhernervosa);
	    System.out.println("Nº de homens agressivos: "+homemagressivo);
	    System.out.println("Nº de Outros calmos: "+outroscalmos);
	    System.out.println("Nº de pessoas nervosas com mais de 40 anos: "+maiorde40n);
	    System.out.println("de pessoas calmas com menos de 18 anos: "+menor18c);
	    leia.close();
	    }
	}
