package lesson2;

import java.util.Locale;

public class lesson2 {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        System.out.println(hi.trim() + world.toLowerCase() + '\n');

        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
    }
}
