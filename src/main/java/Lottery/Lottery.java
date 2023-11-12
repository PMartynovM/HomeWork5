package Lottery;


import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        for (int i = 0 ; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
