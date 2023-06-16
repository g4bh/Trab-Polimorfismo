
public class Acao extends InstrumentoFinanceiro{
	private int cotas;
	
	
	public void setCotas(int cotas) {
		this.cotas = cotas;
	}
	
	
	@Override
	public float calcularSaldoTotal() {
		float saldoTotalCota;
		float saldo = getSaldo();
		
		if(cotas == 0) {
			System.out.println("O número de cotas é igual a zero! Seu saldo é de:  " + saldo);
			return saldo;
		}else{
			System.out.println("O seu saldo com tosas é de: ");
			saldoTotalCota = saldo * cotas;
			return saldoTotalCota;
		}
		
	}
}
