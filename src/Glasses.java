import java.util.Scanner;

public class Glasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double glasses = Integer.parseInt(console.nextLine());
        double workers = Integer.parseInt(console.nextLine());
        double days = Integer.parseInt(console.nextLine());


        double hoursWorked = workers * days * 8;
        double glassesProdused = Math.floor(hoursWorked / 5);

      if(glassesProdused >= glasses){
          double profit = (glassesProdused - glasses) * 4.2;
          System.out.printf("%.2f extra money",profit);
      }else{
          double loss = (glasses - glassesProdused) * 4.2;
          System.out.printf("Losses: %.2f",loss);
      }
    }
}
