public class Main {
    public static void main(String[] args) {

        //Целлочисленный массив
        int [] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        for (int i = 0; i < arrayInt.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrayInt[i]);
        }
        System.out.println();

        //Массив с дробными числами
        double[] arrDouble = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrDouble.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrDouble[i]);
        }
        System.out.println();

        //Произвольный массив
        boolean [] arrBoolean = new boolean[3];
        arrBoolean[0] = arrDouble[1] >= arrayInt[2];
        arrBoolean[1] = arrDouble[0] != arrayInt[1];
        arrBoolean[2] = arrDouble[2] <= arrayInt[0];
        for (int i = 0; i < arrBoolean.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arrBoolean[i]);
        }
    }
}