
public class Editora {

	private String nomeEditora;
	private String localEditora;
	private String ieEditora;
	private String cnpjEditora;
	private String cnpjFornecedor;
	
	public void editarLivro()
	{
		
	}
	public void receberLivro() {
		
	}
	
	public void solicitarMovimentacao() {
		
	}
	
	public static void main(String[] args) {
		Editora editora = new Editora();
		editora.setNomeEditora("Panini");
		editora.setLocalEditora("Avenida da esperança, número 359, Jardim Bela Vista- São Paulo");
		editora.setIeEditora("759273957495");
		editora.setCnpjEditora("10398547569684");
		editora.setCnpjFornecedor("10238243748938");
		System.out.println(editora.getNomeEditora() + "\n" + editora.getLocalEditora() + "\n" + editora.getIeEditora() + "\n" + editora.getCnpjEditora() + "\n" + editora.getCnpjFornecedor());
	}
	
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getLocalEditora() {
		return localEditora;
	}
	public void setLocalEditora(String localEditora) {
		this.localEditora = localEditora;
	}
	public String getIeEditora() {
		return ieEditora;
	}
	public void setIeEditora(String ieEditora) {
		this.ieEditora = ieEditora;
	}
	public String getCnpjEditora() {
		return cnpjEditora;
	}
	public void setCnpjEditora(String cnpjEditora) {
		this.cnpjEditora = cnpjEditora;
	}
	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}
	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}
}
