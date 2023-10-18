import java.util.Scanner;
import java.util.Random;
class numberGame{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int random = ran.nextInt(100);
        System.out.println("===================================");
        System.out.println("             NUMBER GAME           ");
        System.out.println("===================================");
        System.out.println("Guess the random number generated:");
        int i=1;
        while(i<4){
        int input = sc.nextInt();
        if(input> random )
         System.out.println(i +": Your guess is too High");
        else if(input<random)
          System.out.println(i+": Your guess is too low");
        else if(input==random)
        System.out.println(i+": Your guess is correct");
        i++;
        System.out.println("You have more " + (4-i) +" attempts \n");
        }
        System.out.println();
       System.out.println("Your chances are over !");
       System.out.println();
       System.out.println("Random number generated is  :  "+random);
    }
}

   