package homeWorkLes5;

public class Cat extends Animal{
    public Cat (String name) {
        super(name);
        this.maxJumpHeight = 2;
        this.maxRunDist = 200;
        this.tipe = "Cat";
    }
    @Override
    public void swim (int swimDist) {
        System.out.println(this.tipe + " " + this.name + " Cat can not swim ");
    }
}
