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
                counter();
                break;
            }
            case 2:{
                drawRectangle2();
                break;
            }
            case 3:{
                drawRectangle3();
                break;
            }
            case 4:{
                getMax4();
                break;
            }
            case 5:{
                counter5();
                break;
            }
            case 6:{
                drawRectangle6();
                break;
            }
        }
    }
    
    public static void repeater(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Продолжить решать задачи? (y / n)");
        String s = sc.nextLine();
        if (s.equalsIgnoreCase("да") || s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("y")){
            questionAsker();
        }
    }

    //задача 1
    public static void counter(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        repeater();
    }

    //задача 2
    public static void drawRectangle2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        int width = sc.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print("+");
            }
            System.out.println();
        }
        repeater();
    }

    //задача 3
    public static void drawRectangle3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер стороны квадрата: ");
        int side = sc.nextInt();

        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                System.out.print("+");
            }
            System.out.println();
        }
        repeater();
    }

    //задача 4
    public static void getMax4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        System.out.println(max);
        repeater();
    }
    public static Number getMax4(int a, float f){
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

    public static void counter5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int i = sc.nextInt();
        f(i, i);
        System.out.println();
        repeater();
    }

    //задача 6

    static int i = 0;

    static void drawRectangle6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ширину прямоугольника: ");
        int width = sc.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = sc.nextInt();

        drawRectangleAction(width, height);
        System.out.println();
        repeater();
    }

    public static void drawRectangleAction(int x, int y){

        if ((x == 0) && (y == 1)) return;
        if (x != 0){
            i++;
            System.out.print("x ");
            drawRectangleAction(x-1, y);
        } else {
            System.out.println();
            x = i;
            i = 0;
            drawRectangleAction(x, y-1);
        }
    }
}
