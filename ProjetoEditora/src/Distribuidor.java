
public class Distribuidor {

	private String cnpjDistribuidor;
	private String localDistribuidor;
	private String nomeDistribuidor;
	private String cnttDistribuidor;
	private String cnpjEditora;
	
	public void distribuirLivros() {
		
	}
	
	public static void main(String args[]) {
		Distribuidor distribuidor = new Distribuidor();
		distribuidor.setCnpjDistribuidor("47304745682953");
		distribuidor.setLocalDistribuidor("Avenida São Cristóvão, número 236, parque da graça, São Paulo");
		distribuidor.setNomeDistribuidor("Distribuidora Folha Nova");
		distribuidor.setCnttDistribuidor("11908107921");
		distribuidor.setCnpjEditora("10398547569684");
		System.out.println(distribuidor.getCnpjDistribuidor() + "\n" + distribuidor.getLocalDistribuidor() + "\n" + distribuidor.getNomeDistribuidor() + "\n" + distribuidor.getCnttDistribuidor() + "\n" + distribuidor.getCnpjEditora());
	}
	
	public String getCnpjDistribuidor() {
		return cnpjDistribuidor;
	}

	public void setCnpjDistribuidor(String cnpjDistribuidor) {
		this.cnpjDistribuidor = cnpjDistribuidor;
	}

	public String getLocalDistribuidor() {
		return localDistribuidor;
	}

	public void setLocalDistribuidor(String localDistribuidor) {
		this.localDistribuidor = localDistribuidor;
	}

	public String getNomeDistribuidor() {
		return nomeDistribuidor;
	}

	public void setNomeDistribuidor(String nomeDistribuidor) {
		this.nomeDistribuidor = nomeDistribuidor;
	}

	public String getCnttDistribuidor() {
		return cnttDistribuidor;
	}

	public void setCnttDistribuidor(String cnttDistribuidor) {
		this.cnttDistribuidor = cnttDistribuidor;
	}

	public String getCnpjEditora() {
		return cnpjEditora;
	}

	public void setCnpjEditora(String cnpjEditora) {
		this.cnpjEditora = cnpjEditora;
	}
}
