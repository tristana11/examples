package Array;

public class IterateMultiArray {
    public static void main(String[] args) {
        int[][] marks = {
                {1, 2, 4, 8, 1},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        // нумерация в массиве начинается с нуля
        // первый элем.массива (первая строка/первый столбец) имеет индекс-[0][0]

        // 0 , 0 , 0...  marks[1][...] первое значение - нумерация строк
        // 1 , 1 , 1...
        // 2 , 2 , 2...

        // 0 , 1 , 2   marks[...][2] второе значение - нумерация столбцов
        // 0 , 1 , 2
        // 0 , 1 , 2
        // ...  ...  ...

        System.out.println("\nпервый элемент массива marks[0][0] 1 строка/1 столбец - " + marks[0][0]);
        System.out.println("элемент массива marks[1][2] 2 строка/3 столбец - " + marks[1][2]);

        int totalElementsMarks = 0;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) { // перебор элементов массива marks
                sum += marks[i][j]; // сумма всех элементов массива
                totalElementsMarks += 1; // кол-во элементов в массиве
            }
        }
        System.out.println("длина 3 строки массива [2] - " + marks[2].length);
        System.out.println("всего элементов в массиве - " + totalElementsMarks);
        System.out.println("сумма всех элемнтов в массиве - " + sum);
    }

}
