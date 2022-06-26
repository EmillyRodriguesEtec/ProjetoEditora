
public class TipoLivro {

	private double precoUnitTipoLivro;
	private int nmrTipoLivro;
	private TipoLivroEnum tipoLivro;
	private int codLivro;
	
	public static void main(String[] args) {
		TipoLivro tipoLivro = new TipoLivro();
		tipoLivro.setPrecoUnitTipoLivro(59.90);
		tipoLivro.setNmrTipoLivro(453414);
		tipoLivro.setTipoLivro(TipoLivroEnum.IMPRESSO);
		tipoLivro.setCodLivro(284004);
		System.out.println(tipoLivro.getPrecoUnitTipoLivro() + "\n" + tipoLivro.getNmrTipoLivro() + "\n" + tipoLivro.getTipoLivro() + "\n" + tipoLivro.getCodLivro());
	}
	
	public double getPrecoUnitTipoLivro() {
		return precoUnitTipoLivro;
	}
	public void setPrecoUnitTipoLivro(double precoUnitTipoLivro) {
		this.precoUnitTipoLivro = precoUnitTipoLivro;
	}
	public int getNmrTipoLivro() {
		return nmrTipoLivro;
	}
	public void setNmrTipoLivro(int nmrTipoLivro) {
		this.nmrTipoLivro = nmrTipoLivro;
	}
	public TipoLivroEnum getTipoLivro() {
		return tipoLivro;
	}
	public void setTipoLivro(TipoLivroEnum tipoLivro) {
		this.tipoLivro = tipoLivro;
	}
	public int getCodLivro() {
		return codLivro;
	}
	public void setCodLivro(int codLivro) {
		this.codLivro = codLivro;
	}
}
