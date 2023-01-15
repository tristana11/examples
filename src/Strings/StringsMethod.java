package Strings;

public class StringsMethod {
    public static void main(String[] args) {


        // method length() - для нахождения длины строки или длины набора символов
        String str1 = "Java";
        System.out.println(str1.length()); // 4 (method length)


        // method isEmpty() - позволяет проверить строку на пустоту
        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println(myStr1.isEmpty()); // false (method isEmpty() for string)
        System.out.println(myStr2.isEmpty()); // true (method isEmpty() for string)


        // toCharArray() преобразовывает строку обратно в массив символов
        String str0 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        char[] helloArray = str0.toCharArray();


        // проверка на пустую строку
        String s = ""; // строка не указывает на объект
        if (s.length() == 0) {
            System.out.println("String is empty");
        }


        // проверка на null
        String strS = null; // строка не указывает на объект
        if (strS == null) {
            System.out.println("String is null");
        }


        // ошибка! (null != пустой строке)
        /* String strNull = null; // строка не указывает на объект
        if (strNull.length() == 0) { // NullPointerException
            System.out.println("2 String is empty");
        } */

        // предварительно проверять строку на null, потом на 0.
        // String strS = null; строка не указывает на объект
        if (strS != null && s.length() == 0) {
            System.out.println("String is empty");
        }


        // method concat()
        String str11 = "Java";
        String str12 = "Hello";
        String str13 = str12.concat(str11); // HelloJava
        System.out.println(str13);


        // method join() (with delimiter)
        String str21 = "Java";
        String str22 = "Hello";
        String str23 = String.join(" ", str22, str21); // Hello Java
        System.out.println(str23);


        // charAt() извлекает символ по индексу
        String str = "Java";
        char c = str.charAt(2);
        System.out.println(c); // v
        // Как и в массивах индексация начинается с нуля


        // getChars()
        /* извлечение группы символов/подстроки
            метод getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin).
            Он принимает следующие параметры:
            srcBegin индекс, с которого начинается извлечение символов
            srcEnd индекс, до которого идет извлечение символов
            dst массив символов, в кот. будут извлекаться символы
            dstBegin индекс в массиве dst, с кот. будут добавлять извлеченные из строки символы */
        String str25 = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str25.getChars(start, end, dst, 0);
        System.out.println(dst); // world


        // equals() и equalsIgnoreCase()
        /* Для сравнения строк
         equals()   (с учетом регистра)
         equalsIgnoreCase()   (без учета регистра)
         в качестве параметра принимают строку, с которой надо сравнить */
        String str31 = "Hello";
        String str32 = "hello";
        System.out.println(str31.equals(str32)); // false
        System.out.println(str31.equalsIgnoreCase(str32)); // true


        // regionMatches() сравнивает отдельные подстроки в рамках двух строк
        /* boolean regionMatches(int toffset, String other, int oofset, int len)
        boolean regionMatches(boolean ignoreCase, int toffset, String other, int oofset, int len)
     Метод принимает следующие параметры:
ignoreCase надо ли игнорировать регистр символов при сравнении. Если значение true, регистр игнорируется
toffset начальный индекс в вызывающей строке, с которого начнется сравнение
other строка, с которой сравнивается вызывающая
oofset начальный индекс в сравниваемой строке, с которого начнется сравнение
len количество сравниваемых символов в обеих строках */
        String string1 = "Hello world";
        String string2 = "I work";
        boolean result = string1.regionMatches(6, string2, 2, 3);
        System.out.println(result); // true


        // compareTo() и compareToIgnoreCase()
/* сравнить две строки, узнать больше ли одна строка, чем другая
если >0 первая строка больше второй
если <0 вторая больше первой
если 0 то стр. равны */
        String stri1 = "hello";
        String stri2 = "world";
        String stri3 = "hell";
        System.out.println(stri1.compareTo(stri2)); // -15 -> str1 меньше чем stri2
        System.out.println(stri1.compareTo(stri3)); // 1 -> str1 больше чем stri3


        // indexOf() и lastIndexOf()
        /* indexOf() индекс первого вхождения подстроки в строку
        lastIndexOf() индекс последнего вхождения
        Если подстрока не будет найдена возвращает -1 */
        String string = "Hello world";
        int index1 = string.indexOf('l'); // 2
        int index2 = string.indexOf("wo"); // 6
        int index3 = string.lastIndexOf('l'); // 9


        // startsWith() и endsWith()
        /* startsWith()  начинается ли строка с определенной подстроки
        endsWith()  заканчивается строка на определенную подстроку */
        String str01 = "myfile.exe";
        boolean start1 = str01.startsWith("my"); // true
        boolean end1 = str01.endsWith("exe"); // true


        // replace() заменить в строке одну последовательность символов на другую
        String str10 = "Hello world";
        String replStr1 = str10.replace('l', 'd'); // Heddo wordd
        String replStr2 = str10.replace("Hello", "Bye"); // Bye world
        System.out.println(replStr1);
        System.out.println(replStr2);


        // trim() удалить начальные и конечные пробелы
        String st = "  hello world  ";
        st = st.trim(); // "hello world"
        System.out.println(st);


        // substring() возвращает подстр. с определенного индекса до конца/до определенного индекса
        String strs = "Hello world";
        String substrs1 = strs.substring(6); // "world"
        String substrs2 = strs.substring(3,5); // "lo"
        System.out.println(substrs1);
        System.out.println(substrs2);


        // toLowerCase() и toUpperCase()
        // toLowerCase() переводит все символы строки в нижний регистр
        // toUpperCase() - в верхний регистр
        String strr = "Hello World";
        System.out.println(strr.toLowerCase()); // hello world
        System.out.println(strr.toUpperCase()); // HELLO WORLD


        // split() разбить строку на подстроки по определенному разделителю
        // Разделитель - какой-нибудь символ(набор символов) передается в качестве параметра в метод
        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        // В данном случае строка будет разделяться по пробелу

    }
}
