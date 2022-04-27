
public class Motor {
	private String tipo;
	private double Consumo;
	
	public Motor(String tipo, double consumo) {
		super();
		this.tipo = tipo;
		Consumo = consumo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getConsumo() {
		return Consumo;
	}
	public void setConsumo(double consumo) {
		Consumo = consumo;
	}
}
