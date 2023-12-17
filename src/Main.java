import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        //Variables defined.
        int forceOfFour = 4;
        int forceOfFive = 5;

        //Data retrieved from user.
        System.out.print("Enter Number: ");
        int enteredNum = inp.nextInt();


        System.out.print("power of 4 or 5 is: 4, 5,");

        //Power of 4 and 5 is founded in EnteredNum.
        for (int i = 0; i <= enteredNum; i++) {
            if (i == forceOfFour * 4){
                forceOfFour *= 4;
                System.out.print(" "+ forceOfFour + ",");
            } else if (i == forceOfFive * 5) {
                forceOfFive *= 5;
                System.out.print(" " + forceOfFive + ",");
            }
        }


    }
}