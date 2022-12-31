package Array;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayExample2 {
    public static void main(String[] args) {


//With default values
        int[] num = new int[3]; // [0, 0, 0]
        Object[] object = new Object[3]; // [null, null, null]

        boolean[] booleans = new boolean[3];
        System.out.println(booleans[0] + " " + booleans[1] + " " + booleans[2]);

        char[] chars = new char[3];
        System.out.println(chars[0] + " " + chars[1] + " " + chars[2]);

        int[] ints = new int[3];
        System.out.println(ints[0] + " " + ints[1] + " " + ints[2]);

        double[] doubles = new double[3];
        System.out.println(doubles[0] + " " + doubles[1] + " " + doubles[2]);

        String[] Strings = new String[3];
        System.out.println(Strings[0] + " " + Strings[1] + " " + Strings[2]);




//With array literal
        int[] nums1 = {1, 2, 3};
        int[] nums2 = new int[]{1, 2, 3};

        Object[] objects1 = {new Object(), new Object(), new Object()};
        Object[] objects2 = new Object[]{new Object(), new Object(), new Object()};





//With loop for
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i; // can contain any YOUR filling strategy
        }

        Object[] objects = new Object[3];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Object(); // can contain any YOUR filling strategy
        }





//With loop for and Random
        int[] nums3 = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums3.length; i++) {
            nums3[i] = random.nextInt(10); // random int from 0 to 9
        }




// With Stream (since Java 8)
        int[] numers1 = IntStream.range(0, 3)
                .toArray(); // [0, 1, 2]
        int[] numers2 = IntStream.rangeClosed(0, 3)
                .toArray(); // [0, 1, 2, 3]
        int[] numers3 = IntStream.of(10, 11, 12, 13)
                .toArray(); // [10, 11, 12, 13]
        int[] numers4 = IntStream.of(12, 11, 13, 10)
                .sorted()
                .toArray(); // [10, 11, 12, 13]
        int[] numers5 = IntStream.iterate(0, x -> x <= 3, x -> x + 1)
                .toArray(); // [0, 1, 2, 3]
        int[] numers6 = IntStream.iterate(0, x -> x + 1)
                .takeWhile(x -> x < 3)
                .toArray(); // [0, 1, 2]

        int size = 3;
        Object[] object1 = IntStream.range(0, size)
                .mapToObj(i -> new Object()) // can contain any YOUR filling strategy
                .toArray(Object[]::new);

        Object[] object2 = Stream.generate(() -> new Object()) // can contain any YOUR filling strategy
                .limit(size)
                .toArray(Object[]::new);



// With Random and Stream (since Java 8)
        int sizes = 3;
        int randomNumberOrigin = -10;
        int randomNumberBound = 10;
        int[] numses = new Random().ints(sizes, randomNumberOrigin, randomNumberBound).toArray();
    }
}