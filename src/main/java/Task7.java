/*Write a Java Program to print the first 10 numbers of Fibonacci series.*/
public class Task7 {
    public static void main(String[] args) {
        int prev=0;
        int next=1;
        int sumOfPrevTwo;

        for (int i = 0; i <10 ; i++) {
            System.out.print(prev+" ");
            sumOfPrevTwo=prev+next;
            prev=next;
            next=sumOfPrevTwo;
        }

    }
}
