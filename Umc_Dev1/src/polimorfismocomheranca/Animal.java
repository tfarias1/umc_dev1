package polimorfismocomheranca;

class Animal {
  public void animalSound() {
    System.out.println("O som dos Animais");
  }
}
class Porco extends Animal {
  public void animalSound() {
    System.out.println("O Porco faz: wee wee");
  }
}
class Cachorro extends Animal {
  public void animalSound() {
    System.out.println("O Cachorro faz : au au ");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  
    Animal myPig = new Porco();  
    Animal myDog = new Cachorro();  
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}