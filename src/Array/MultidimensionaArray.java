package Array;

public class MultidimensionaArray {
    public static void main(String[] args) {




        //With default value
        int[][] numses = new int[3][3]; // [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
        Object[][] objectses = new Object[3][3]; // [[null, null, null], [null, null, null], [null, null, null]]




        //With array literal
        int[][] num1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] num2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Object[][] objects1 = {
                {new Object(), new Object(), new Object()},
                {new Object(), new Object(), new Object()},
                {new Object(), new Object(), new Object()}
        };
        Object[][] objects2 = new Object[][]{
                {new Object(), new Object(), new Object()},
                {new Object(), new Object(), new Object()},
                {new Object(), new Object(), new Object()}
        };




        //With loop for
        int[][] nums = new int[3][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; i++) {
                nums[i][j] = i + j; // can contain any YOUR filling strategy
            }
        }

        Object[][] objects = new Object[3][3];
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < nums[i].length; i++) {
                objects[i][j] = new Object(); // can contain any YOUR filling strategy
            }
        }

    }

}
