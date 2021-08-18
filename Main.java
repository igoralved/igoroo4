package src;

public class Main {
	public static void main(String[] args) {
		System.out.println("\f");
		CarroAutomatico ca = new CarroAutomatico("2600", 2, 3, true, 8);
		ca.print();
		ca.ligar();
		ca.print();
		ca.pressionafreio();
		ca.ligar();
		ca.print();
		
		MotoPartidaPedal mpp = new MotoPartidaPedal("5200", 3, 2, true, 10);
		mpp.print();
		Guincho g = new Guincho("7800", 5, 5, 11);
		g.print();
		g.ligar();
		g.print();
		g.ligar();
		g.print();
	}
	
	
}
