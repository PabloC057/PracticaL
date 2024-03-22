package BeingsOfEarth;

import LivingBeings.LivingBeings;

public class Dog extends LivingBeings {
    @Override
    public void born() {
        System.out.println("A new Dog has been born!");
    }
    @Override
    public void grow() {
        System.out.println("The dog has grown!");
    }
    @Override
    public void reproduce() {
        System.out.println("The dog had puppies!");
    }
    @Override
    public void die() {
        System.out.println("The dog has Died! :(");
    }
    public void play() { System.out.println("The dog is playing! :)"); }
    public void sleep() {
        System.out.println("The dog is now sleeping");
    }
}