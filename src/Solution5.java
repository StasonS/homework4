/**
 * Решить задачу 1, без использования циклов. Использовав рекурсию.
 *
 * Задание 1:
 * Написать функцию которая считает в консоли до числа Х.
 * Аргументы функции: число Х Например Х = 5.
 * Вывод программы: 1 2 3 4 5
 */
public class Solution5 {
    public static void main(String[] args) {

        int value = 5;
        f(value);
        System.out.println();

        //Решение через метод с двумя параметрами,
        // т.к. в противном случае не знаю, как зафиксировать константу
        f(value, value);
    }

    public static void f(int num){
        if (num != 0){
            System.out.print((num/* + 1 - n*/) + " ");
            f(--num);
        }

    }
    public static void f(int num, int cnst){
        if (num != 0){
            System.out.print((cnst + 1 - num) + " ");
            f(--num, cnst);
        }

    }
}
