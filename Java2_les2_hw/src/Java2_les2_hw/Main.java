package Java2_les2_hw;

import java.util.Arrays;

public class Main {
    public static int n;
    public static String s;
    public static String[][] ar2;


    private static  String[][] strArray() {

        String[] ar1 = s.split("\n");
        System.out.println(Arrays.deepToString(ar1));
        ar2 = new String[n][];
        for (int i = 0; i < n; i++) {
            ar2[i] = Arrays.copyOfRange(ar1, i * ar1.length / n, (i + 1) * ar1.length / n);
        }

        System.out.println(Arrays.deepToString(ar2));
        throw new ArrayIndexOutOfBoundsException("Количество строк в матрице не равно 4");
    }


    private static float intArray () throws MyArrayDataException {

        int sum = 0;
        float div;
        int[][] ar3 = new int [n][n];
        for (int i = 0; i < ar2.length; i++){
           for (int j = 0; j < ar2[i].length; j++){
               try {
                    ar3[i][j] = Integer.parseInt(ar2[i][j]);
               } catch (NumberFormatException e) {
                   throw new MyArrayDataException ("В строке "+i+", столбце"+j+" не число");
               }
           }

        }
        for (int i = 0; i < ar3.length; i++) {
            for (int j = 0; j < ar3[i].length; j++) {
                ar3[i][j] = Integer.parseInt(ar2[i][j]);
                sum += ar3[i][j];
            }
        }div = sum /2;
        return div;



    }

    public static void main(String[] args) throws MyArrayDataException {
        s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        n = 4;

        try {
            strArray();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally {}
        intArray();
        System.out.println("end of main");
    }


}
