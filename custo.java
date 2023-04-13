package exercicios;
import java.util.Scanner;

public class custo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double precoDeCusto;
		double acressimo;
		double valorVenda;
		
		
		System.out.print("Digite o preço de custo do produto: ");
		precoDeCusto = input.nextDouble();
		
		System.out.print("Digite a porcentagem de acressimo: ");
		acressimo = input.nextDouble();
		
		valorVenda = (precoDeCusto * acressimo)/ 100+ precoDeCusto;
		
		System.out.print("O valor da venda do produto é: " +valorVenda+ "R$");
		

	}

}
