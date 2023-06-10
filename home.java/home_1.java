//Первый семинар.
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

//Пункты реализовать в методе main
//*Пункты реализовать в разных методах

//int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;
import java.util.Scanner;

//package home.java;

public class Main {
    public static void main(String[] args) {
        //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2000);   
        System.out.println(i);
    
        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(i).length();   
        System.out.println(n);

        int [] m1 = multiple(i, n);
        System.out.println(m1);

        int [] m3 = multiple2(i, n);
        System.out.print(m3);
    }



        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static int[] multiple(int i, int n) {
        int j = i;
        int count = 0;
        for (j = i;j < Short.MAX_VALUE;j++){
        if (j % n == 0){
            count ++;
            }
        }

        int [] m = new int [count];
        count = 0;
        for (j = i;j < Short.MAX_VALUE;j++){
            if (j % n == 0){
                m[count++] = j;
                }
            }
        return m;
    }

    //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static int[] multiple2(int i, int n) {
        int j = i;
        int count = 0;
        for (j = Short.MIN_VALUE;j < i;j++){
        if (j % n != 0){
            count ++;
            }
        }

        int [] m2 = new int [count];
        count = 0;
        for (j = Short.MIN_VALUE;j < i;j++){
            if (j % n != 0){
                m2[count++] = j;
                }
            }
        return m2;
    }





}
