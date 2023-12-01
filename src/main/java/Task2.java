/*Create an array of integer values.
After the array is created, calculate the
sum of all stored elements in that array.*/
public class Task2 {
    public static void main(String[] args) {
        int [] array={-65,64,863,-433,8746,-664,354,1};
        int sumOfAll=0;

        for (int i = 0; i < array.length; i++) {
            sumOfAll=sumOfAll+array[i];
        }
        System.out.println("The sum of all elements is "+sumOfAll);
    }
}
