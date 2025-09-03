public class Cachorro extends Animal{
	
	private String raca;
	
	public String emitirSom() {
		return "Latido";
	}

	public String alimentar() {
		return "Ração";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
