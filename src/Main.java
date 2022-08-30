public class Main {
    public static void main(String[] args) {
        //Целлочисленный массив
        int [] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        //Массив с дробными числами
        double[] arrDouble = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(arrDouble[i]);
        }

        //Произвольный массив
        boolean [] arrBoolean = new boolean[3];
        arrBoolean[0] = arrDouble[1] >= arrayInt[2];
        arrBoolean[1] = arrDouble[0] != arrayInt[1];
        arrBoolean[2] = arrDouble[2] <= arrayInt[0];
        System.out.println(arrBoolean[0] + " " + arrBoolean[1] + " " + arrBoolean[2]);
    }
}