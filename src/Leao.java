public class Leao extends Animal{

	private double tamanhojuba;
	
	public String emitirSom() {
		return "Rugido";
	}
	
	public String alimentar() {
		return "Carne";
	}

	public double getTamanhojuba() {
		return tamanhojuba;
	}

	public void setTamanhojuba(double tamanhojuba) {
		this.tamanhojuba = tamanhojuba;
	}
}
