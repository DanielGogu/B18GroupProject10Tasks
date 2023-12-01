/*Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only.*/
public class Task3 {
    public static void main(String[] args) {
        int [][] array={
                {-25,44,67,85,23},
                {-88,123,654,8166,321,489},
                {654,321,9874,-4,56},
                {564,12186,54,13,156}
        };
        System.out.println("The even numbers of the 2D Arrays Are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (array[i][j]%2==0){
                    System.out.print(array[i][j]+" ");
                }

            }

        }

    }
}
