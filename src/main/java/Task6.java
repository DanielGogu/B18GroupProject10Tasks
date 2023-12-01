import java.util.Scanner;

/*Write a java program to check whether a given number is prime or not?*/
public class Task6 {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Please Enter the number ");
        int num= qq.nextInt();
        boolean numCheck = false;
        for (int i = 2; i <num ; i++) {
            if (num==0||num==1){
                numCheck=false;
                break;

            } else if (num%i==0) {
                numCheck=false;
                break;
            }else {
                numCheck=true;
            }
        }
        if(numCheck) {
            System.out.println("The number " + num + " Is a prime number");
        }else {
            System.out.println("The number "+num+" Is not a prime number");
        }

    }
}
