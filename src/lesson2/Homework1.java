package lesson2;

public class Homework1 {
    public static void main(String[] args) {

        //Задача №1

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        
        String hiWorld = (hi.trim() + world.toLowerCase() + newLine).repeat(3);
        System.out.println(hiWorld);


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

