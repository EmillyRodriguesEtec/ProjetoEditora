
public class Autor {

	private String nomeAutor;
	private String cnttAutor;
	private String cpfAutor;
	private int codLivro;
	
	public void escreveLivro() {
		
	}
	
	public static void main(String args[]) {
		Autor autor = new Autor();
		autor.setNomeAutor("Anne");
		autor.setCnttAutor("11992853957");
		autor.setCpfAutor("67839475080");
		autor.setCodLivro(284004);
		System.out.println(autor.getNomeAutor() + "\n" + autor.getCnttAutor() + "\n" + autor.getCpfAutor() + "\n" + autor.getCodLivro());
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getCnttAutor() {
		return cnttAutor;
	}

	public void setCnttAutor(String cnttAutor) {
		this.cnttAutor = cnttAutor;
	}

	public String getCpfAutor() {
		return cpfAutor;
	}

	public void setCpfAutor(String cpfAutor) {
		this.cpfAutor = cpfAutor;
	}

	public int getCodLivro() {
		return codLivro;
	}

	public void setCodLivro(int codLivro) {
		this.codLivro = codLivro;
	}
}
