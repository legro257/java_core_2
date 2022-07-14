package lesson2;

public class Homework1 {
    public static void main(String[] args) {

        //Задача №1

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String hiWord = (hi.trim() + world.toLowerCase()).repeat(3);
        String perenos = String.valueOf(newLine);
        System.out.println(hiWord + perenos);


        //Задача №2

        Double rost = 1.72;
        int ves = 80;
        Double index = ves / (rost * 2);
        System.out.println(index);


        //Задача №3

        char[] array = new char[]{'a','b','c','d','e'};
        String charText = String.valueOf(array);
        String zamena = charText.replace("d", "h");

        System.out.println(charText);
        System.out.println(zamena);
    }
}
