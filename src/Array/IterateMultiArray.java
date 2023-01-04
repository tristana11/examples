package Array;

public class IterateMultiArray {
    public static void main(String[] args) {
        int[][] marks = {
                {1, 2, 4, 8, 1},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        // 0 , 0 , 0...   первое значение-нумерация строк
        // 1 , 1 , 1...     marks[1][2]
        // 2 , 2 , 2...

        // 0 , 1 , 2   второе значение-нумерация столбцов
        // 0 , 1 , 2     marks[1][2]
        // 0 , 1 , 2
        // ...  ...  ...

         // первое значение - индекс в столбце
        // второе - индекс в строке
        System.out.println("\nэлемент массива marks [2 строки][3 столбца] - " + marks[1][2]);

        int totalElementsMarks = 0;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) { // перебор элементов массива marks
                sum += marks[i][j]; // сумма всех элементов массива
                totalElementsMarks += 1; // кол-во элементов в массиве
            }
        }
        System.out.println("длина 3 строки массива - " + marks[2].length);
        System.out.println("всего элементов в массиве - " + totalElementsMarks);
        System.out.println("сумма всех элемнтов в массиве - " + sum);
    }

}
