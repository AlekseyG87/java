package homeWorkLes4;

public class Worker {


    //private int uid;
    //private int id;
    private String name;
    private int salary;
    private int age;
    int[] n;

    Worker (String name, int salary, int age, int ... n) {
        //uid = 0;
        //uid++;
        //this.id= uid;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.n = n;
    }

    //public   int getId() {
    //    return  this.id;

    public   String getName() {
        return  this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public int[] getN() {
        return n;

    }

    void printNameAge () {
        System.out.println("Name" + name + "Age" + age);
    }

    public void printInfo () {
        System.out.println("Name: " + name + " Salary: " + salary + " Age: " + age + n);
    }
    public int setSalary(int salary) {
        this.salary = salary;
    }




}
