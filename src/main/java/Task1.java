/*Create a program that uses an array to store
a list of temperatures for a week,
and then uses a loop to find the highest
and lowest temperature for the week.*/
public class Task1 {
    public static void main(String[] args) {
        int [] weekTemp={-5,10,7,-2,0,6,14};
        double mInfinity=-1.0/0.0;
        double pInfinity=1.0/0.0;

        for (int i = 0; i < weekTemp.length; i++) {
            if(weekTemp[i]>mInfinity){
                mInfinity=weekTemp[i];
            }

        }
        System.out.println("The highest temperature of the week is "+mInfinity);
        System.out.println();
        for (int i = 0; i < weekTemp.length; i++) {
            if (weekTemp[i]<pInfinity){
                pInfinity=weekTemp[i];
            }
        }
        System.out.println("The lowest temperature of the week is "+pInfinity);

    }
}
