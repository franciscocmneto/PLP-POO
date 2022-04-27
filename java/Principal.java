
public class Principal {
	
	public static void main(String[] args) {
		
		Carro gol = new Carro();
		
		Motor motor = new Motor("combustao", 12.0);
		
		gol.setMotor(motor);
		
		System.out.println("O carro possui " + gol.getNumeroPortas() +" portas ");
		System.out.println("O carro possui motor do tipo "+ gol.getMotor().getTipo());
	}
}
