package Раздел_4_Коллекции.set_interface;

import java.util.HashSet;

public class HashSetEx2 {

    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(3);
        hashSet1.add(10);
        hashSet1.add(2);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        // union - объединение, метод addAll
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        // intersect - пересечение, метод retainAll
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        // subtract - разность, метод removeAll
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
    }

}