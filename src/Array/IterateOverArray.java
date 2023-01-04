package Array;
public class IterateOverArray {
    public static void main(String[] args) {
        int[] marks = { 1, 2, 3, 4, 5, 6};
        int sumMarks = 0;
        
        // обычный for
        for (int i = 0; i < marks.length; i++) { // перебор элементов массива marks
            sumMarks += marks[i];
        }
        System.out.println(sumMarks);

        // улучшенный for
        int sumMarks2 = 0;
        for (int j : marks) { // перебор элементов массива marks
            sumMarks2 += j;
        }
        System.out.println(sumMarks2);
    }
}
