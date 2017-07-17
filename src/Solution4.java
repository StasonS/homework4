/**
 * Написать функцию getMax которая принимает на вход два аргумента в виде чисел.
 * А возврыщает максимальное из этих двух.
 * Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)
 */
public class Solution4 {
    public static void main(String[] args) {

        System.out.println(getMax(3, 5));
        System.out.println(getMax(39, 5.5f));
    }

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
}
