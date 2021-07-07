package homeWorkLes5;

public class Main {

    public static void main(String[] args) {
        Cat c1 = new Cat ("Barseek");
        Cat c2 = new Cat ("Murzik");
        Dog d1 = new Dog ("Don");
        Dog d2 = new Dog ("Dick");

        c1.run(100);
        c2.run(300);
        d1.run(400);
        d2.run(550);
        c1.jump(1);
        c2.jump(3);
        d1.jump(0.4);
        d2.jump(0.55);
        c1.swim(1);
        c2.swim(3);
        d1.swim(9);
        d2.swim(11);

        System.out.println();

        // второй вариант
        Animal [] a = {c1, c2, d1, d2};
        for (int i = 0; i < a.length; i++) {
            a[i].run(100);
            a[i].jump(1);
            a[i].swim(1);
            if (a[i] instanceof Cat)
                System.out.println(a[i].tipe + " " + a[i].name + " Cat can not swim ");


        }

    }
}
