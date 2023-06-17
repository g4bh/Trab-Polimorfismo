
public class Acao extends InstrumentoFinanceiro{
	private int cotas;
	
	
	public void setCotas(int cotas) {
		this.cotas = cotas;
	}
	
	
	@Override
	public float calcularSaldoTotal() {
		float saldoTotalCota;
		float saldo = getSaldo();
		
		if(cotas <= 0) {
			return saldo;
		}else{
			saldoTotalCota = saldo * cotas;
			return saldoTotalCota;
		}
		
	}
}
