/**
 * Решить задачу 2, без использования циклов. Использовав рекурсию.
 *
 * Задание 2
 * Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 * Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах
 * Например 3 на 2 Вывод программы: + + + + + +
 */
public class Solution6 {

    public static void main(String[] args) {

        drawRectangle(2, 3);
    }

    public static void drawRectangle(int width, int height){

//        Вариант 1 - не работает
//        while (height != 0) {
//            if (width > 0) {
//                System.out.print("+");
//                drawRectangle(--width, height);
//            } else {
//                System.out.println("+");
//                drawRectangle(width, --height);
//            }
//        }

//        Вариант 2 - не работает
//        if (width > 0){
//            System.out.print("+");
//            width--;
//            drawRectangle(width, height);
//        }
//
//        System.out.println();
//        height--;
//        if (height > 0) {
//            drawRectangle(width, height);
//        }

    }


}
