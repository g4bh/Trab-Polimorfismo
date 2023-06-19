package Banco;

import java.util.Scanner;

public class Banco {
	private InstrumentoFinanceiro[] instrumentos;
	private int numInstrumentos;
	
	public void adicionar(InstrumentoFinanceiro instrumento) {
		instrumentos = new InstrumentoFinanceiro[4];
		numInstrumentos = 0;
		
		System.out.println("Por favor, informa o tipo de instrumenot financeiro: \n1 - Ação \n2 - Conta Corrente \n3 - Fundo de Aplicação");
		Scanner scanner = new Scanner(System.in);	
		
		numInstrumentos = scanner.nextInt();
		
		if(numInstrumentos == 1 ) {
			System.out.println("Informe o sua cota: ");
			int cotas = scanner.nextInt();
			instrumento.Acao.setCotas(cotas);   //precisa de alteração nessa linha
		}
	};
	
	public void calcularSaldos() {}; //float
		
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcaoMenu;
		
		do {
			System.out.println("Menu de opções: \n1. Adicionar instrumento financeiro \n2. Calcular saldo \n3. Sair \nEscolha uma opção: ");
			opcaoMenu = scanner.nextInt();
			
			switch(opcaoMenu) {
			case 1:
				banco.adicionar(null);
				
			case 2:
				banco.calcularSaldos();
				
			case 3:
				System.out.println("Programa encerrado!");
			}
			
		}while (opcaoMenu != 3);
	}
}
