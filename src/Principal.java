
public class Principal {
	
	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
        c1.setNome("Zeus");
        c1.setIdade(2);
        c1.setPeso(23);
        c1.setHabitat("Apartamento");
        c1.setRaca("Husky");

        Gato g1 = new Gato();
        g1.setNome("Max");
        g1.setIdade(3);
        g1.setPeso(4.2);
        g1.setHabitat("Apartamento");
        g1.setCor("Preto");

        Leao l1 = new Leao();
        l1.setNome("Aslan");
        l1.setIdade(8);
        l1.setPeso(190.0);
        l1.setHabitat("Savana");
        
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Som: " + c1.emitirSom());
        System.out.println("Alimentação: " + c1.alimentar());
        System.out.println("");

        System.out.println("Nome: " + g1.getNome());
        System.out.println("Som: " + g1.emitirSom());
        System.out.println("Alimentação: " + g1.alimentar());
        System.out.println("");

        System.out.println("Nome: " + l1.getNome());
        System.out.println("Som: " + l1.emitirSom());
        System.out.println("Alimentação: " + l1.alimentar());
        System.out.println("");
	}

}
