package src;

public class Carro  extends Automovel {
	
	protected static final int CAR_TOP_SPEED = 10;
	
	public Carro(String placa, int velocidade, int aceleracao, boolean automatico, boolean partidapedal, int topspeed) {
		super(placa, velocidade, aceleracao, automatico,partidapedal, topspeed);
	}
	
	@Override
	public void speedup() {
		if(automatico) {
			aumentavelocidade();
		}else {
			super.speedup();
		}
	}
	
	@Override
	public String toString() {
		return "Carro " + super.toString();
	}
	
	
}
