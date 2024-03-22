import BeingsOfEarth.Dog;
import BeingsOfEarth.Human;
import Creator.LivingBeingCreator;
import SkyBeings.Bird;

public class Main {
    public static void main(String[] args){
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


        System.out.println("Creating Living Beings");
        LivingBeingCreator creator = new LivingBeingCreator();
        creator.createLivingBeings();
    }
}
