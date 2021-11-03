import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        //------------------------------------------------1--------------------------------------------//
        ArrayList<Person> people = new ArrayList<>();
        LinkedList<Person> people1 = new LinkedList<>();

        for (int i = 0; i < 10; i ++){
            people.add(new Person());
            people1.add(new Person());
        }
        while (people.size() != 2){
            for (int i = 1; i < people.size(); i++){
                people.remove(i);
            }
        }
        people.remove(1);

        while (people1.size() != 2){
            for (int i = 1; i < people1.size(); i++){
                people1.remove(i);
            }
        }
        people1.remove(1);
        //----------------------------------------------2------------------------------------------
 // Я решил просто отсортировать массив и тогда при любом иксе условие выполняется. Для удобства убираем в таком случае X )))0)

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 10 ; i > 0; i--){
            arrayList.add(i);
        }
        for (int i = arrayList.size() - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arrayList.get(j) > arrayList.get(j + 1))
                    arrayList.set(j+1, arrayList.get(j+1) + arrayList.get(j));
                    arrayList.set(j, arrayList.get(j+1) - arrayList.get(j));
                    arrayList.set(j+1, arrayList.get(j+1) - arrayList.get(j));
                }
            }
        for (int i = 0 ; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}

class Person{
    private String name;
    private String surName;
}
