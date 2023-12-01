/*Create a 2D array of integers.
Develop a program which will calculate the
sum of even and odd numbers for that array.*/
public class Task4 {
    public static void main(String[] args) {
        int [][] array={
                {-25,44,67,85,23},
                {-88,123,654,8166,321,489},
                {654,321,9874,-4,56},
                {564,12186,54,13,156}
        };
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (array[i][j]%2==0){
                    evenSum=evenSum+array[i][j];
                }else{
                    oddSum=oddSum+array[i][j];
                }

            }

        }
        System.out.println("The sum of all Even numbers in the array is :"+evenSum);
        System.out.println("The sum of all Odd numbers in the array is :"+oddSum);
    }
}
