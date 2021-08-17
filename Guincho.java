package src;

public class Guincho extends Automovel {

	protected static final int GUINCHO_TOP_SPEED = 2;
	
	
	
	public Guincho(String placa, int velocidade, int aceleracao, int topspeed) {
		super(placa, velocidade, aceleracao, true,true, topspeed);
	}	
	
	@Override
	public void speedup() {
		aumentavelocidade();
	}
	
	@Override 
	public String toString() {
		return "Guincho " + super.toString();
	}
	
}
