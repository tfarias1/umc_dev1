package heranca.polimorfismo;

public class HerancaPolimorfismo {
    public static void main(String[] args) {
    Animal meuAnimal = new Animal();
    Porco meuPorco = new Porco();
    Cachorro meuCachorro = new Cachorro();
        
    meuAnimal.animalSound();
    meuPorco.animalSound();
    meuCachorro.animalSound();
    }
    
}
