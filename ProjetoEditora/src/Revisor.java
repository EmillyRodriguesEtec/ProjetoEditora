
public class Revisor {

	private String nomeRevisor;
	private String cnttRevisor;
	private String cpfRevisor;
	
	public void revisarLivro() {
		
	}

	public static void main(String[] args) {
		Revisor revisor = new Revisor();
		revisor.setNomeRevisor("Juliana");
		revisor.setCnttRevisor("11992478564");
		revisor.setCpfRevisor("20744805424");
		System.out.println(revisor.getNomeRevisor() + "\n" + revisor.getCnttRevisor() + "\n" + revisor.getCpfRevisor());
	}
	
	public String getNomeRevisor() {
		return nomeRevisor;
	}

	public void setNomeRevisor(String nomeRevisor) {
		this.nomeRevisor = nomeRevisor;
	}

	public String getCnttRevisor() {
		return cnttRevisor;
	}

	public void setCnttRevisor(String cnttRevisor) {
		this.cnttRevisor = cnttRevisor;
	}

	public String getCpfRevisor() {
		return cpfRevisor;
	}

	public void setCpfRevisor(String cpfRevisor) {
		this.cpfRevisor = cpfRevisor;
	}
}
