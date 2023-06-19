package Banco;

public class ContaCorrente extends InstrumentoFinanceiro {
	private float limite;
	
	public void setLimite(float limite) {
		this.limite = limite; 
	}
	
	
	@Override
	public float calcularSaldoTotal() {
		float saldoTotalLimite;
		
		saldoTotalLimite = limite + getSaldo();
		return saldoTotalLimite;
		
	}
	
	
}
