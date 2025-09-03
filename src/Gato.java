
public class Gato extends Animal {
	
	private String cor;
	
	public String emitirSom() {
		return "Miau";
	}
	
	public String alimentar() {
		return "Ração de gato";
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
