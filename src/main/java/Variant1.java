

public class Variant1 {
    //    Дана відстань L у сантиметрах. Використовуючи операцію поділу націло,
//    визначити кількість повних метрів у ньому (1 метр = 100 см).
    public static  int toMeters(int sm){
        return sm >= 0 ? (int)sm/100 : 0;
    }

    //    Дано ціле число A. Перевірити істинність висловлювання: «Число A є позитивним».
    public static boolean isPositive(int a){
        return a > 0;
    }

    //    Дано ціле число. Якщо воно є позитивним, додати до нього 1;
//    інакше не змінювати його. Вивести отримане число.
    public static  int ifPositive(int b){
        return b > 0 ? ++b : b;
    }

    public static String getDayByArray(int index){
        if ((index < 1) || (index > 7)) return "Wrong input";
        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        return days[index-1];
    }
    //    Дано ціле число у діапазоні 1–7. Вивести рядок - назву дня тижня,
//    що відповідає даному числу (1 - "понеділок", 2 - "вівторок" і т. д.).
    public static String getDay(int index){
        switch (index){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Wrong input";
        }
    }
    //    Дано цілі числа K і N (N > 0). Вивести N разів число K
    public static int getNByK(int N, int K){
        if(N < 0) {
            System.out.println("Input N > 0");
            return -1;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(K);
        }
        return N;
    }

    //    Дано позитивні числа A і B (A > B).
//    На відрізку довжини A розміщено максимальну кількість відрізків довжини B (без накладень).
//    Не використовуючи операції множення та розподілу, знайти довжину незайнятої частини відрізка A.
    public static int whileAnBTask(int A, int B){
        int tmp = A;
        while(tmp - B >= 0){
            tmp -=B;
        }
        return tmp;
    }
    //    Дано ціле число N (> 0).
//    Сформувати і вивести цілий масив розміру N, що містить N перших позитивних непарних чисел: 1, 3, 5, … .
    public static int[] arrayTask(int[] Array){
        int N = Array.length;

        int arr[] = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = 1 + i * 2;

        }

        return arr;

    }
    //    Дано цілі позитивні числа M і N.
//    Сформувати цілочисленну матрицю розміру M x N,
//    у якої всі елементи I-го рядка мають значення 10·I (I = 1, …, M).
    public static int[][] matrixTask(int M, int N){
        int matrixArray[][] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrixArray[i][j] = 10 * i;
            }
        }
        return matrixArray;
    }

    public static void main(String[] args) {
        System.out.println(toMeters(163));
    }

}

