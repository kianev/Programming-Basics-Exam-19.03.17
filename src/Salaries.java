import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int lectures = Integer.parseInt(console.nextLine());
        double budget = Double.parseDouble(console.nextLine());
        double lectureBudget = budget / lectures;
        int jelev = 0;
        int royal = 0;
        int roli = 0;
        int trofon = 0;
        int sino = 0;
        int gast = 0;

        for (int i = 0; i < lectures ; i++) {
            String lecturers = console.nextLine().toLowerCase();
            if(lecturers.equals("jelev")){
                jelev++;
            }else if(lecturers.equals("royal")){
                royal++;
            }else if(lecturers.equals("roli")){
                roli++;
            }else if(lecturers.equals("trofon")){
                trofon++;
            }else if(lecturers.equals("sino")){
                sino++;
            }else{
                gast++;
            }
        }
        System.out.printf("Jelev salary: %.2f lv%n",jelev*lectureBudget);
        System.out.printf("RoYaL salary: %.2f lv%n",royal*lectureBudget);
        System.out.printf("Roli salary: %.2f lv%n",roli*lectureBudget);
        System.out.printf("Trofon salary: %.2f lv%n",trofon*lectureBudget);
        System.out.printf("Sino salary: %.2f lv%n",sino*lectureBudget);
        System.out.printf("Others salary: %.2f lv%n",gast*lectureBudget);
    }
}
