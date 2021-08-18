package src;

public class MotoPartidaPedal extends Moto {

	private boolean puxaacelerador;
	
	public MotoPartidaPedal(String placa, int velocidade, int aceleracao, boolean automatico, int topspeed) {
		super(placa, velocidade, aceleracao, automatico, true, topspeed);
		puxaacelerador = false;
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
		if(puxaacelerador) {
			super.ligar();
		}
	}

	public void puxaacelerador() {
		puxaacelerador = !puxaacelerador;
	}
	
	
}
