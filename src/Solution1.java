/**
 * Написать функцию которая считает в консоли до числа Х.
 * Аргументы функции: число Х Например Х = 5.
 * Вывод программы: 1 2 3 4 5
 */
public class Solution1 {

    public static void main(String[] args) {
        counter(6);
    }

    public static void counter(int num){
        for (int i = 0; i < num; i++){
            System.out.print((i + 1) + " ");
        }
    }
}
