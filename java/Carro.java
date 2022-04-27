
public class Carro extends Automovel {
	
	private String placa;
	private int numeroPortas;

	public Carro() {
		System.out.println("Chamando construtor");
		this.numeroPortas = 4;		
	}
	
	public Carro(String placa_, int numeroPortas_) {
		System.out.println("Chamando construtor");
		this.placa = placa_;
		this.numeroPortas = numeroPortas_;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
}
