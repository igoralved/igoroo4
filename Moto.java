package src;

public class Moto  extends Automovel {
	
	protected static int MOTO_TOP_SPEED = 5;
	
	public Moto(String placa, int velocidade, int aceleracao, boolean automatico, boolean partidapedal, int topspeed) {
		super(placa, velocidade, aceleracao, automatico, partidapedal, topspeed);
	}
	
	@Override
	public void speedup() {
		if(partidapedal) {
			aumentavelocidade();
		}else {
			super.speedup();
		}
	}

	@Override
	public String toString() {
		return "Moto " + super.toString();
	}
	
}
