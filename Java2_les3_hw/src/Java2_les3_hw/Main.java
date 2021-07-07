package Java2_les3_hw;


import java.util.*;


public class Main {

    public static void main(String[] args) {
        String [] w = {"Рубашка", "Брюки", "Пиджак", "Галстук", "Пижама",
                "Носки","Кофта","Брюки","Брюки", "Рубашка"};
        words(w);

        System.out.println("=========================================");

        initPhonebook();


    }

   private static void words(String[] w) {
       ArrayList <String> words = new ArrayList<>(Arrays.asList(w));
       System.out.println(words);
       Set<String> nonrep= new HashSet<>(words);
       System.out.println(nonrep.toString());
       Iterator<String> iter = nonrep.iterator();
       while (iter.hasNext()) {
           String s = iter.next();
           System.out.println(s + "-" + Collections.frequency(words, s));
       }
   }

    private static void initPhonebook(){
        Phonebook phonebook = new Phonebook();

	    phonebook.add("Зайцев", "123456");
        phonebook.add("Волков", "987654");
        phonebook.add("Медведев", "124567");
        phonebook.add("Куницын", "134567");
        phonebook.add("Лисов", "123567");
        phonebook.add("Пауков", "985341");
        phonebook.add("Белкин", "568712");
        phonebook.add("Зайцев", "123450");

        System.out.println(phonebook.get("Волков"));
        System.out.println(phonebook.get("Зайцев"));
        System.out.println(phonebook.get("Иванов"));

        phonebook.add("Зайцев", "123450");
    }
}
