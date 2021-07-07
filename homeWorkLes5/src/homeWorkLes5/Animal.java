package homeWorkLes5;

import java.util.Random;

public class Animal {
    protected final String name;
    protected String  tipe;
    protected int maxRunDist;
    protected double maxJumpHeight;
    protected int maxSwimDist;
    public Random random = new Random();





    protected Animal (String name) {
        this.name = name;


    }
    public void run (int runDist) {
        if (runDist <= maxRunDist) System.out.println(this.tipe + " " + this.name + " run " + runDist + " metrs");
        else System.out.println(this.tipe + " " + this.name + " can not run so far");
    }

    public void jump (double jumpHeight) {
        if (jumpHeight <= maxJumpHeight) System.out.println(this.tipe + " " + this.name + " jump " + jumpHeight + " metrs");
        else System.out.println(this.tipe + " " + this.name + " can not jump so far");
    }

    public void swim (int swimDist) {
        if (swimDist <= maxSwimDist) System.out.println(this.tipe + " " + this.name + " swim " + swimDist + " metrs");
        else System.out.println(this.tipe + " " + this.name + " can not swim so far");
    }



}
