// Организовать ввод и хранение данных пользователей. ФИО возраст и пол
// вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!)
// *реализовать сортировку по возрасту с использованием индексов
// *реализовать сортировку по возрасту и полу с использованием индексов

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Comparator;

public class home_4 {
    public static void main(String[] args) {
        //ввод и хранение данных пользователей. ФИО возраст и пол
        ArrayList <String> people = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("How many people? ");
        int n = Integer.parseInt(iScanner.nextLine());
        for (int i = 0; i < n; i++){
        
        System.out.println("Write your last name, first name and second name: ");
        String name = iScanner.nextLine();
        System.out.println("Write your age and gender: ");
        String age = iScanner.nextLine();
            people.add(name + " " + age);
    }
    System.out.println(people);
    // вывод в формате Фамилия И.О. возраст пол
    for (int i = 0; i < people.size();i++){
        String[]array = people.get(i).split(" ");
        System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "." + 
        array[2].toUpperCase().charAt(0) + "." + " " + array[3] + " " + array[4]);
    }
    // добавить возможность выхода или вывода списка отсортированного по возрасту!)
        people.sort (new Comparator<String>(){
            @Override
            public int compare (String o1, String o2){
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
        for (int i = 0; i < people.size();i++){
            String[]array = people.get(i).split(" ");
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "." + 
            array[2].toUpperCase().charAt(0) + "." + " " + array[3] + " " + array[4]);
        }
        //*реализовать сортировку по возрасту с использованием индексов
        ArrayList<Integer>id = new ArrayList<>(null);
        for (int i = 1;i <= n;i++){
            id.add(i);
        }
        Collection.sort (id, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
        for (int i = 0; i < people.size();i++){
            String[]array = people.get(i).split(" ");
            System.out.println(id + array[0] + " " + array[1].toUpperCase().charAt(0) + "." + 
            array[2].toUpperCase().charAt(0) + "." + " " + array[3] + " " + array[4]);
        }

        System.out.println("To exit the program, press Q.");
        String choice = iScanner.nextLine();
        while (choice.equals("Q") || choice.equals("q")) {
                System.out.println("Exit from the program.");
                break;
            }

    iScanner.close();
    }
}
// Twem Mark Markovich
// Neylor Anna Leopoldovna
// London Jak Jakovich