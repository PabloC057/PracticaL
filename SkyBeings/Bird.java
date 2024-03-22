package SkyBeings;

import LivingBeings.LivingBeings;
import BeingsOfEarth.EarthBeing;

public class Bird extends LivingBeings implements EarthBeing, SkyBeing {
    @Override
    public void born() {
        System.out.println("A new bird has been born!");
    }
    @Override
    public void reproduce() {
        System.out.println("The bird has had little birds!");
    }
    @Override
    public void grow() {
        System.out.println("The bird has grown!");
    }
    @Override
    public void die() {
        System.out.println("The bird has died! :(");
    }
    @Override
    public void fly() {
        System.out.println("The bird is flying!");
    }
    @Override
    public void changeDimension() {
        System.out.println("The bird has traveled to another dimension!");
    }

    @Override
    public void respawn() {System.out.println("The bird has respawned!");}
}