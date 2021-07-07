package Java2_les5_hw_;


import java.util.Arrays;

public class Main {
    private static final int size = 10_000_000;
    private static final int h = size / 2;

    public static void main(String[] args) {
        Main m = new Main();
        m.firstMethod();
        m.secondMethod();
    }
    private void firstMethod () {
        System.out.println("Метод 1");
        float [] arr = new float[size];
        Arrays.fill(arr, 1);
        System.out.println("Цикл расчета первого метода");
        calcArray(arr);



    }

    private void secondMethod () {
        System.out.println("Метод 2");
        float [] arr = new float[size];
        float [] arr1 = new float[h];
        float [] arr2 = new float[h];
        Arrays.fill(arr, 1);
        long initTime = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        long divTime = System.currentTimeMillis();
        System.out.println("Время разбивки на 2 массива = " + (divTime - initTime));
        Thread thread1 = new Thread(() ->this.calcArray(arr1));
        Thread thread2 = new Thread(() ->this.calcArray(arr2));


        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


        long bondTime = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long endTime = System.currentTimeMillis();
        System.out.println("Время склейки = " + (endTime - bondTime));
    }

    private void calcArray (float [] arr) {
        long initTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long calcArrTime = System.currentTimeMillis();
        System.out.println("Время расчета = " + (calcArrTime - initTime));
    }
}
