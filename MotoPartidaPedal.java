package src;

public class MotoPartidaPedal extends Moto {

	private boolean puxouacelerador;
	
	public MotoPartidaPedal(String placa, int velocidade, int aceleracao, boolean automatico, int topspeed) {
		super(placa, velocidade, aceleracao, automatico, true, topspeed);
	}
	
	@Override
	public void speedup() {
		aumentavelocidade();
	}

	@Override
	public String toString() {
		return "Partida pedal " + super.toString();
	}
	
	@Override 
	public void ligar() {
		
	}
	
}
