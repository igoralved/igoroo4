package src;

public class CarroAutomatico extends Carro {

	public CarroAutomatico(String placa, int velocidade, int aceleracao, boolean partidapedal, int topspeed) {
		super(placa, velocidade, aceleracao,true, partidapedal, topspeed);
	}
	
	@Override
	public void speedup() {
		aumentavelocidade();
	}
	
	@Override
	public String toString() {
		return "Automatico " + super.toString();
	}
	
}
