package homeWorkLes4;

public class Main {

    public static void main(String[] args) {
        Worker [] w = new Worker[5];
        w[0] = new Worker("Ivanov", 10000, 20);
        w[1] = new Worker("Petrov", 20000, 21);
        w[2] = new Worker("Sidorov", 40000, 46);
        w[3] = new Worker("Koshechkin", 41000, 25);
        w[4] = new Worker("Mamedov", 45000, 47);
        for (int i = 0; i < w.length; i++) {
            if (w[i].getAge() > 40) w[i].printInfo();
        }

    }

    private static int changeSalary (Worker [] w){

        for (int i = 0; i < w.length; i++) {

            if (w[i].getAge() > 45) w[i].setSalary() = w[i].getSalary() + 5000;
        }
   }

    private static int arithAver (Worker [] w) {
        float amSalary = 0;
        float amAge = 0;
        float sumSalary = 0;
        float sumAge =0;
        for (int i = 0; i < w.length; i++) {

            sumSalary += w[i].getSalary();
           sumAge += w[i].getAge();
        }
        amSalary = sumSalary / w.length;
        amAge = sumAge / w.length;
        System.out.println("arifmetic average of salary - " + amSalary);
        System.out.println("arifmetic average of age - " + amAge);

    }
}
