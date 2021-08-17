package src;

public abstract class Automovel {

	protected String placa;
	protected int velocidade;
	protected int aceleracao;
	protected boolean automatico;
	protected boolean partidapedal;
	protected boolean ligado;
	protected int distancia;
	protected int topspeed;
	
	public Automovel(String placa, int velocidade, int aceleracao, boolean automatico, boolean partidapedal, int topspeed) {
		this.placa = placa;
		this.velocidade = velocidade;
		this.aceleracao = aceleracao;
		this.automatico = automatico;
		this.partidapedal = partidapedal;
		this.topspeed = topspeed;
		ligado = false;
		distancia = 0;
	}
	
	public boolean getLigado() {
		return ligado;
	}
	
	public int getDistancia() {
		return distancia;
	}
	
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getAceleracao() {
		return aceleracao;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}
	
	public int getTopSpeed() {
		return topspeed;
	}
	
	public void setTopSpeed(int topspeed) {
		this.topspeed = topspeed;
	}
	
	public void ligar() {
		ligado = !ligado;
	}

	public boolean diminuiparazero() {
		return velocidade - aceleracao <= 0;
	}
	
	public boolean aumentaparamaxima() {
		return velocidade + aceleracao >= topspeed;
	}
	
	public void speedup() {
		if(!ligado) {
			aumentavelocidade();
		}
	}

	public void aumentavelocidade() {
		if(aumentaparamaxima()) {
			velocidademaisaceleracao();
		}else {
			velocidademaxima();
		}
	}

	public void velocidademaisaceleracao() {
		velocidade += aceleracao;
	}
	
	public void speeddown() {
		if(!ligado) {
			decrementaVelocidade();
		}
	}

	public void decrementaVelocidade() {
		if(diminuiparazero()) {
			velocidademenosaceleracao();
		}else {
			zeravelocidade();
		}
	}

	public void zeravelocidade() {
		velocidade = 0;
	}

	public void velocidademenosaceleracao() {
		velocidade -= aceleracao;
	}
	
	public void velocidademaxima() {
		velocidade = topspeed;
	}

	public String toString() {
		return "Placa: " + placa
				+ " Velocidade: " + velocidade
				+ " Aceleracao: " + aceleracao +
				" Velocidade maxima: " + topspeed;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
}
