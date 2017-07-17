/**
 * Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать
 * на вход только 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами
 * Например 2 Вывод программы: + + + + Например 3 Вывод программы: + + + + + + + + +
 */
public class Solution3 {

    public static void main(String[] args) {
        drawRectangle(4);
    }

    //Оригинальная версия
    public static void drawRectangle(int width, int height){

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

    //Перегруженная версия
    public static void drawRectangle(int side){
        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
