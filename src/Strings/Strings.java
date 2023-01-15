package Strings;

public class Strings {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String(); //string is empty
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[] {'w', 'e', 'l', 'c', 'o', 'm', 'e'});
        String str5 = " ";
        System.out.println(str1); // Java
        System.out.println(str2); // string is empty
        System.out.println(str3); // hello
        System.out.println(str4); // welcome

        String str6 = str3 + str5 + str4; // конкотенация строк (соединение) оператор +
        System.out.println(str6); // hello welcome

        String str7 = "Год " + 2015; // при сложении стр. и нестр. -  преобраз. в строку
        System.out.println(str7); // Год 2015
    }
}
