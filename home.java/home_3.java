// Пусть дан произвольный список из 100 целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class home_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0;i < 100;i++){
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);
        for (int i = list.size();i-- > 0;){
            if (list.get(i) % 2 == 0){
                list.remove(i);

            }
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        int sum = 0;
        for (int i = 0;i < list.size();i++){
            sum = sum + i;
        }
        int number = sum / list.size();
        System.out.println(number);
    }
}
