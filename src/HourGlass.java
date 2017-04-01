import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        System.out.println(printStars("*",2*n+1));
        System.out.println(".*" + printStars(" ", 2*n-3) + "*.");
        for (int i = 0; i < n-2 ; i++) {
            System.out.println(printStars(".",2 + i) + "*" + printStars("@",n*2 - 5 - i*2) + "*" +
            printStars(".",2 + i));
        }
        System.out.println(printStars(".",n) +"*"+ printStars(".",n));
        for (int i = 0; i < n-2 ; i++) {
            System.out.println(printStars(".",n-1-i) + "*" + printStars(" ",i) + "@" +
            printStars(" ",i) + "*" + printStars(".",n-1-i));
        }


        System.out.println(".*" + printStars("@",2*n - 3) + "*.");
        System.out.println(printStars("*",2*n+1));

    }
    public static String printStars(String strToRepeat,int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
