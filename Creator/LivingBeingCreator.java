package Creator;

import BeingsOfEarth.Human;
import BeingsOfEarth.Dog;
import SkyBeings.Bird;
public class LivingBeingCreator implements Creator {
    @Override
    public void createLivingBeings() {
        System.out.println("Creating instances of living beings from both earth and sky.");
        Human LuisCarlos = new Human();
        Dog Lucas = new Dog();
        Bird Piolin = new Bird();
        System.out.println("Human Actions");
        LuisCarlos.born();
        LuisCarlos.grow();
        LuisCarlos.reproduce();
        LuisCarlos.die();
        LuisCarlos.respawn();
        LuisCarlos.fly();
        LuisCarlos.changeDimension();


        System.out.println("Dog Actions");
        Lucas.born();
        Lucas.grow();
        Lucas.reproduce();
        Lucas.die();
        Lucas.play();
        Lucas.sleep();


        System.out.println("Bird Actions");
        Piolin.born();
        Piolin.grow();
        Piolin.reproduce();
        Piolin.die();
        Piolin.respawn();
        Piolin.fly();
        Piolin.changeDimension();

    }
}