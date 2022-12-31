package Color;

public class TextColor {
    //Научимся выводить цветной текст (символы) на консоль с помощью управляющих символов ANSI.
    //создадим константы: 1 сброс цвета и 9 для цветов
    static final String RESET ="\u001b[0m"; // \u001b управляющий символ ANSI. 0 номер цвета
    static final String BLACK ="\u001b[30m"; // 30 номер цвета
    static final String RED ="\u001b[31m"; // 32 номер цвета
    static final String GREEN ="\u001b[32m"; // 32 номер цвета
    static final String YELLOW ="\u001b[33m"; // 33 номер цвета
    static final String BLUE ="\u001b[34m"; // 34 номер цвета
    static final String PURPLE ="\u001b[35m"; // 35 номер цвета
    static final String CYAN ="\u001b[36m"; // 36 номер цвета
    static final String WHITE ="\u001b[37m"; // 37 номер цвета

    public static void main(String[] args) {
        print (RESET);
        print (BLACK);
        print (RED);
        print (GREEN);
        print (YELLOW);
        print (BLUE);
        print (PURPLE);
        print (CYAN);
        print (WHITE);
    }

    public static void print (String color) { //метод для вывода текста(символа)
        for (int i = 0; i < 40; i++) {    // цикл-счетчик символов в строке
            System.out.print(color +"@"); //текст(символ) в стр.):"\u0580"- ր ;"\u050D"- ֍ ; %; $; @...
        }
        System.out.println();
    }

}
