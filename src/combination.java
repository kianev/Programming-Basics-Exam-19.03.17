import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int begin = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());
        int magicN = Integer.parseInt(console.nextLine());
        int counter = 0;
        int brk = 0;
        int first = 0;
        int second = 0;

        for (int i = begin; i >= end ; i--) {
            if(brk == magicN){
                break;
            }
            for (int j = begin; j >= end ; j--) {
                counter++;
                if(i + j == magicN){
                    first = i;
                    second = j;
                    brk = magicN;
                    break;
                 }
                }
            }
            if(brk > 0){
                System.out.printf("Combination N:%d ",counter);
                System.out.println("(" + first + " + " + second + " = " + magicN + ")");
            }else {
                System.out.println(counter + " combinations - neither equals " + magicN);
            }
        }

    }
