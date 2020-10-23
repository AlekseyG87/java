package Java3_Les1;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	    Object [] arr = {1, 15, 20, 48, 25};
	    changeArrayElem(arr, 1, 4);
	    conversionArray(arr);
        boxWithFruit();
    }
    private static void changeArrayElem (Object arr[],int x, int y) {
        System.out.println("Original array " + Arrays.toString(arr));
        Object ce = arr[x];
        arr[x] = arr[y];
        arr[y] = ce;
        System.out.println("Changed array " + Arrays.toString(arr));

    }
    private static <T extends Object> void conversionArray (T arr[]) {
        //version 1
        ArrayList <T> al1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList v1 " + al1);

        // version 2
        ArrayList <T> al2 = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            al2.add ((T) arr[i]);
        }
        System.out.println("ArrayList v2 " + al2);
    }

    private static void boxWithFruit () {
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        orangeBox1.addFruit(new Orange(), 5);
        orangeBox2.addFruit(new Orange(), 3);
        appleBox1.addFruit(new Apple(), 5);
        System.out.println("orangeBox1 weight " + orangeBox1.getWeight());
        System.out.println("orangeBox2 weight " + orangeBox2.getWeight());
        System.out.println("appleBox1 weight " + appleBox1.getWeight());
        System.out.println("Compare weight appleBox1 and orangeBox1 " + appleBox1.sameWeight(orangeBox1));
        orangeBox1.addAll(orangeBox2);
        System.out.println("orangeBox1 new weight " + orangeBox1.getWeight());
        System.out.println("orangeBox2 new weight " + orangeBox2.getWeight());
    }
}
