package Color;

public class TextColorTest1 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_Y_FON = "\u001b[43m";
    //Сброс цвета такой же: \u001b[0m
//текст:
//Яркий чёрный	\u001b[30;1m
//Яркий красный	\u001b[31;1m
//Яркий зелёный	\u001b[32;1m
//Яркий жёлтый	\u001b[33;1m
//Яркий синий	\u001b[34;1m
//Яркий пурпурный	\u001b[35;1m
//Яркий голубой	\u001b[36;1m
//Яркий белый	\u001b[37;1m
//Сброс цвета	\u001b[0m
 //Сброс цвета такой же: \u001b[0m
//фон:
//Чёрный	\u001b[40m
//Красный	\u001b[41m
//Зелёный	\u001b[42m
//Жёлтый	\u001b[43m
//Синий	\u001b[44m
//Пурпурный	\u001b[45m
//Голубой	\u001b[46m
//Белый	\u001b[47m

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "This text is RED!" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "This text is BLUE!" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "This text is PURPLE!" + ANSI_RESET);
        System.out.printf("%s %sThis text is BLACK!%s%n", ANSI_Y_FON, ANSI_BLACK, ANSI_RESET);
        System.out.printf("%s %sThis fon is YELLOW!%s%n", ANSI_Y_FON, ANSI_BLACK, ANSI_RESET);
        System.out.println(ANSI_YELLOW + "text");
        System.out.print(ANSI_RESET);
        System.out.print("text");
    }
}