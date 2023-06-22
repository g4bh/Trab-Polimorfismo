package Banco;

import java.util.Scanner;

public class Banco {
	private InstrumentoFinanceiro[] instrumentos;
	private int numInstrumentos;
	
	public Banco() {
		this.instrumentos = new InstrumentoFinanceiro[4];
		this.numInstrumentos = 0;
	}
	
	
	public void adicionar(InstrumentoFinanceiro instrumento) {
	    if (numInstrumentos < instrumentos.length) {
	        instrumentos[numInstrumentos] = instrumento;
	        numInstrumentos++;
	        System.out.println("Instrumento financeiro adicionado com sucesso!");
	    } else {
	        System.out.println("Limite de instrumentos atingido!");
	    }
	    
	}
	
	
	public float calcularSaldos() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu saldo: ");
		float saldoUsuario = scanner.nextFloat();
		
		float saldoTotal = saldoUsuario;
		
		
		for(int i = 0; i < numInstrumentos; i++) {
			
			if(instrumentos[i] instanceof Acao) {
				saldoTotal += instrumentos[i].calcularSaldoTotal();
			    System.out.println("Saldo total das Ações: " + saldoTotal);
			    break;
			}else if(instrumentos[i] instanceof ContaCorrente) {
				saldoTotal += instrumentos[i].calcularSaldoTotal();
				System.out.println("Saldo total das Ações: " + saldoTotal);
				break;
			}else {
				saldoTotal += instrumentos[i].calcularSaldoTotal();
				System.out.println("Saldo total das Ações: " + saldoTotal);
			}
			
		}
		
		return saldoTotal;

	}
	
		
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcaoMenu;
		
		do {
			System.out.println("Menu de opções: \n1. Adicionar instrumento financeiro \n2. Calcular saldo \n3. Sair \nEscolha uma opção: ");
			opcaoMenu = scanner.nextInt();
			
			switch(opcaoMenu) {
			case 1:
				System.out.println("Informa qual o tipo de instrumento financeiro adiconar: ");
				int tipoInstru = scanner.nextInt();
					
				Acao acao = null;
				ContaCorrente conta = null;
				FundoDeAplicacao fundoAplicacao  = null;
				
				switch(tipoInstru) {
					
				case 1:
				System.out.println("Informe o número de cotas: ");
		                int cotas = scanner.nextInt();
		                acao = new Acao();
		                acao.setCotas(cotas);
		                banco.adicionar(acao);
		                break;
		                
				case 2:
				System.out.println("Informe seu limite: ");
		                float limite = scanner.nextFloat();
		                conta = new ContaCorrente();
		                conta.setLimite(limite);
		                banco.adicionar(conta);
		                break;					
		               
				case 3:
				System.out.println("Informe sua rentabilidade: ");
		                float fundo = scanner.nextFloat();
		                fundoAplicacao = new FundoDeAplicacao();
		                fundoAplicacao.setRentabilidade(fundo);
		                banco.adicionar(fundoAplicacao);
		                break;
				
				}
				
			case 2:
				banco.calcularSaldos();
				
			case 3:
				System.out.println("Programa encerrado!");
			}
			
		}while (opcaoMenu != 3);
	}

}
