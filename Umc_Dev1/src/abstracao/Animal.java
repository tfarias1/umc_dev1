
package abstracao;

abstract class Animal {
 
  public abstract void animalSound();
  
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass 
class Pig extends Animal {
  public void animalSound() {
    
    System.out.println("O Porco Faz: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}



