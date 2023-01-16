package Strings;

public class StringExamples {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "";
        String str2 = null;

        System.out.println(str.length());

        if(str1.length() == 0) {
            System.out.println("String is empty");
        }

        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());


        if(str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
        } else {
            System.out.println("Длина строки: " + str.length());
        }

    }
}
