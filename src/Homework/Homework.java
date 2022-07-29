package Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework {
    public static void main(String[] args) throws IOException {
//        Car car = new Car();
//        car.startsMoving();
//        car.stopMoving();
//        car.lights();

        Toyota toyota = new Toyota();
        toyota.toyotaMusic();
        toyota.startsMoving();
        toyota.stopMoving();
        toyota.lights();

        Lada lada = new Lada();
        lada.ladaBreak();
        lada.startsMoving();
        lada.stopMoving();
        lada.lights();


        // Задание №2

        FileReader fileReader = new FileReader("C:\\Users\\legro\\IdeaProjects\\java_core_2\\src\\Homework\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.print(line + " ");
        }

        bufferedReader.close();
        fileReader.close();

        // Задание №3

        Financial_record financial_record = new Financial_record(500, 300);

        String report = "C:\\Users\\legro\\IdeaProjects\\java_core_2\\src\\Homework\\report.txt";
        FileWriter fileWriter = new FileWriter(report, true);
        fileWriter.write("доходы = " + financial_record.getIncomes() + ", " + "расходы = " + financial_record.getOutcomes());
        fileWriter.close();
    }
}
