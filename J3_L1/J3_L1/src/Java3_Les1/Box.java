package Java3_Les1;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList <T> box = new ArrayList<>();

    public Box () {

    }

        public float getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            T o = box.get(i);
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean sameWeight(Box anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.00001;
    }

    public void addAll (Box<T> anotherBox) {
       anotherBox.box.addAll(box);
       box.clear();
    }

    public void addFruit (T fruit, int count) {
        for (int i=0; i<count; i++) {
            box.add(fruit);
        }
    }


}
