package src;

public class CarroAutomatico extends Carro {

	private boolean pressionoufreio;
	
	public CarroAutomatico(String placa, int velocidade, int aceleracao, boolean partidapedal, int topspeed) {
		super(placa, velocidade, aceleracao,true, partidapedal, topspeed);
		pressionoufreio = false;
	}
	
	@Override
	public void speedup() {
		aumentavelocidade();
	}
	
	@Override
	public String toString() {
		return "Automatico " + super.toString();
	}
	
	@Override 
	public void ligar() {
		if(pressionoufreio) {
			ligado = !ligado;
		}
	}
	
	public void pressionafreio() {
		pressionoufreio = !pressionoufreio;
	}
	
}
