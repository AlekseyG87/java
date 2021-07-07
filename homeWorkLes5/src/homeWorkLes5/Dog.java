package homeWorkLes5;

public class Dog extends Animal {


    public Dog (String name) {
        super(name);
        this.maxJumpHeight = 0.5;
        this.maxRunDist = random.nextInt(201) + 400;
        //this.maxRunDist = 500;
        this.maxSwimDist = 10;
        this.tipe = "Dog";

        //int [] runLimit  = {400, 600};
        //for (int i=0; i < runLimit.length; i++)
        //    this.maxRunDist = (int) (random.nextInt(runLimit[i]));
    }

}
