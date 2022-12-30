public class MethodSyntax2 {
    public static void main(String[] args) {
        Person2 bob = new Person2(); // вызов первого конструктора без параметров
        bob.displayInfo();

        Person2 tom = new Person2("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();

        Person2 sam = new Person2("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}

class Person2 { //в классе определено три конструктора
    String name; // имя
    int age; // возраст

    Person2() {
        name = "Undefined";
        age = 18;
    }

    Person2(String n) {
        name = n;
        age = 18;
    }

    Person2(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
