public class Method_Syntax {
    //два класса в одном файле. только один public. public class Method_Syntax
    //файл должен называться по имени этого класса Method_Syntax.java
        public static void main(String[] args) {
            // создаем переменнуя tom обределяющую класс Person
            Person tom = new Person(); // создание объекта Person- new Person()
            // переменная tom - ссылка на объект
            // объект Person - хранит все данные
            tom.displayInfo(); // вызов метода displayInfo без параметров

            // изменяем имя и возраст
            tom.name = "Tom";
            tom.age = 34;
            tom.displayInfo();  // вызов метода displayInfo

            // изменяем имя и возраст
            tom.name = "Angela";
            tom.age = 15;
            tom.displayInfo();  // вызов метода displayInfo
        }
    }
    // класс Person
class Person { // класс Person с (переменными(name age) и методом(displayInfo))
    String name;    // имя - членами класса - полями (fields - переменные класса)
    int age;        // возраст - членами класса - полями (fields - переменные класса)
    void displayInfo() {
            System.out.printf("Name:%s Age:%d %n", name, age);
    }
}
