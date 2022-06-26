
public class Movimentacao {

	private int nmrMov;
	private String dataMov;
	private FormaPagamentoEnum formaPagamento;
	private String cnpjEditora;
	private int codNF;
	
	public void gerarNotaFiscal() {
		
	}
	
	public static void main(String[] args) {
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setNmrMov(793024);
		movimentacao.setDataMov("16-oct-2009");
		movimentacao.setFormaPagamento(FormaPagamentoEnum.BOLETO);
		movimentacao.setCnpjEditora("10398547569684");
		movimentacao.setCodNF(204732);
		System.out.println(movimentacao.getNmrMov() + "\n" + movimentacao.getDataMov() + "\n" + movimentacao.getFormaPagamento() + "\n" + movimentacao.getCnpjEditora() + "\n" + movimentacao.getCodNF());
		
	}

	public int getNmrMov() {
		return nmrMov;
	}

	public void setNmrMov(int nmrMov) {
		this.nmrMov = nmrMov;
	}

	public String getDataMov() {
		return dataMov;
	}

	public void setDataMov(String dataMov) {
		this.dataMov = dataMov;
	}

	public FormaPagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getCnpjEditora() {
		return cnpjEditora;
	}

	public void setCnpjEditora(String cnpjEditora) {
		this.cnpjEditora = cnpjEditora;
	}

	public int getCodNF() {
		return codNF;
	}

	public void setCodNF(int codNF) {
		this.codNF = codNF;
	}
}
