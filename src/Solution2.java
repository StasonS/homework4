
/**
 * Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 * Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах
 * Например 3 на 2 Вывод программы: + + + + + +
 */
public class Solution2 {

    public static void main(String[] args) {

        drawRectangle(7, 3);
    }

    public static void drawRectangle(int width, int height){

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
