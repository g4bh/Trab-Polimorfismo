package Banco;

public class FundoDeAplicacao extends InstrumentoFinanceiro{
	private float rentabilidade;
	
	public void setRentabilidade(float rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	
	@Override
	public float calcularSaldoTotal() {
		float saldoTotalRentabilidade;
		saldoTotalRentabilidade = getSaldo() + (getSaldo() * rentabilidade / 100);
		return saldoTotalRentabilidade; 
	}
}
