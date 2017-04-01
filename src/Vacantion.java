import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        double price = 0;

        if(budget <= 1000){
            if(season.equals("summer")){
                price = budget * 0.65;
                System.out.printf("Alaska - Camp - %.2f",price);
            }else if(season.equals("winter")){
                price = budget * 0.45;
                System.out.printf("Morocco - Camp - %.2f",price);
            }
        }else if(budget > 1000 && budget <= 3000 ){
            if(season.equals("summer")){
                price = budget * 0.80;
                System.out.printf("Alaska - Hut - %.2f",price);
            }else if(season.equals("winter")){
                price = budget * 0.60;
                System.out.printf("Morocco - Hut - %.2f",price);
            }
        }else if(budget > 3000){
            if(season.equals("summer")){
                price = budget * 0.90;
                System.out.printf("Alaska - Hotel - %.2f",price);
            }else if(season.equals("winter")){
                price = budget * 0.90;
                System.out.printf("Morocco - Hotel - %.2f",price);
            }
        }
    }
}
