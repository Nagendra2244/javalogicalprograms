abstract class Animal {
  abstract void animalSound();
 void sleep() {
    System.out.println("zuuu");
  }
}

class dog extends Animal {
 void animalSound() {
    System.out.println("The dog says:Bow bow");
  }
}

class Abstraction2 {
  public static void main(String[] args) {
   Animal a1=new Animal();
    Animal a2=new Animal();
    a1.animalSound();
    a2.sleep();
  }
}