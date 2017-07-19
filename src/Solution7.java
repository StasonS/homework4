import java.util.Scanner;

/**
 * Написать программу, в которой выполнены все шесть предыдущих заданий.
 * Каждое задание выполняется в отдельной функции. В пределах этой же функции происходит ввод с консоли
 * необходимых данных. Программа спрашивает пользователя какую задачу он хочет решить (от 1 до 6).
 * Затем программа вызывает соответствующую функцию для решения этой задачи.
 * По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи.
 * Если да - опять спрашивает какую задачу.
 */
public class Solution7 {

    public static void main(String[] args) {

        questionAsker();

    }

    public static void questionAsker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую задачу вы хотел бы решить (от 1 до 6)?");
        int taskNum = sc.nextInt();
        switch (taskNum){
            case 1:{
                System.out.println("Введите число");
                int i = sc.nextInt();
                counter(i);
                System.out.println(1);
                repeater();
                break;
            }
            case 2:{
                System.out.print("Введите ширину прямоугольника: ");
                int width = sc.nextInt();
                System.out.print("Введите высоту прямоугольника: ");
                int height = sc.nextInt();
                drawRectangle(width, height);
                repeater();
                break;
            }
            case 3:{
                System.out.print("Введите размер стороны квадрата: ");
                int side = sc.nextInt();
                drawRectangle(side);
                repeater();
                break;
            }
            case 4:{
                System.out.println("Введите два числа");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(getMax(a, b));
                repeater();
                break;
            }
            case 5:{
                System.out.println("Введите число");
                int i = sc.nextInt();
                f(i, i);
                System.out.println();
                repeater();
                break;
            }
            case 6:{
                System.out.print("Введите ширину прямоугольника");
                int width = sc.nextInt();
                System.out.print("Введите высоту прямоугольника");
                int height = sc.nextInt();
                //AAAAAAAAAAAAA
                repeater();
                break;
            }
        }
    }
    public static void repeater(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Продолжить решать задачи?");
        String s = sc.nextLine();
        if (s.equalsIgnoreCase("да") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y")){
            questionAsker();
        }
    }

    //задача 1
    public static void counter(int num){
        for (int i = 0; i < num; i++){
            System.out.print((i + 1) + " ");
        }
    }

    //задача 2
    public static void drawRectangle(int width, int height){

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

    //задача 3
    public static void drawRectangle(int side){
        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

    //задача 4
    public static int getMax(int a, int b){

        int max = Math.max(a, b);
        return max;
    }
    public static Number getMax(int a, float f){
        float a1 = a;
        if (a1 > f)
            return a;
        else return f;
    }

    //задача 5
    public static void f(int num, int cnst){
        if (num != 0){
            System.out.print((cnst + 1 - num) + " ");
            f(--num, cnst);
        }

    }

    //задача 6
}
