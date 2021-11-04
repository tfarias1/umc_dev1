
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