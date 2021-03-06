
public class NotaFiscal {

	private int codNF;
	private double valorUnitNF;
	private double valorTotalNF;
	private String dataEmissao;
	
	public int emitirNotaFiscal() {
		return codNF;
	}

	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscal();
		nf.setCodNF(204732);
		nf.setValorUnitNF(55.90);
		nf.setValorTotalNF(230.90);
		nf.setDataEmissao("22-nov-2021");
		nf.emitirNotaFiscal();
		System.out.println(nf.getCodNF() + "\n" + nf.getValorUnitNF() + "\n" + nf.getValorTotalNF() + "\n" + nf.getDataEmissao() + "\n" + nf.emitirNotaFiscal());
	}
	
	public int getCodNF() {
		return codNF;
	}

	public void setCodNF(int codNF) {
		this.codNF = codNF;
	}

	public double getValorUnitNF() {
		return valorUnitNF;
	}

	public void setValorUnitNF(double valorUnitNF) {
		this.valorUnitNF = valorUnitNF;
	}

	public double getValorTotalNF() {
		return valorTotalNF;
	}

	public void setValorTotalNF(double valorTotalNF) {
		this.valorTotalNF = valorTotalNF;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
}
