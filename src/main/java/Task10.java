/*Write a program to print out duplicate elements from an Array of Strings*/
public class Task10 {
    public static void main(String[] args) {
        String[] array={"Anna", "Mateo", "Ernest","Anna","John", "Ester","Bill", "Elise", "Bill"};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);

                }
            }
        }

    }
}
