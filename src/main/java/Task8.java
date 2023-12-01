/*Maximum and minimum number in the array*/
public class Task8 {
    public static void main(String[] args) {
        int [][] array={
                {-654,321,48,32,9},
                {3,84,-31,87},
                {264,989,-359,64,189,74},
                {6546,31,847,7,64}
        };
        double minusInfinity=-1.0/0.0;
        double plusInfinity=1.0/0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j]>minusInfinity){
                    minusInfinity=array[i][j];
                }
            }
        }
        System.out.println("The Biggest number in the array is "+minusInfinity);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(array[i][j]<plusInfinity){
                    plusInfinity=array[i][j];
                }
            }
        }
        System.out.println("The Smallest number in the array is "+plusInfinity);

    }
}
