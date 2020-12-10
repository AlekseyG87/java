package homeWorkLes2;

import java.util.Arrays;

public class Main {

    private static void firstEx () {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 2);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void secondEx () {
        int[] b = new int[8];
        b[0] = 1;
        for (int i = 1; i < b.length; i++) {
            b[i] = b[i-1] + 3;
        }
        System.out.println(Arrays.toString(b));
    }

    private static void thirdEx () {
        int [] c = {1, 5, 3, 2, 11, 4, 5, 2, 4 ,8 ,9 ,1};
        for (int i = 0; i < c.length; i++) {
            c[i] = (c[i] < 6) ? (c[i] * 2) : c[i];
        }
        System.out.println(Arrays.toString(c));
    }

    private static void fouthEx () {
        int[] d = new int[10];

        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(d));
        int dMax = d[0];
        int dMin = d[0];
        for (int i = 0; i < d.length; i++) {
            if (d[i] > dMax)
                dMax = d[i];

            if (d[i] < dMin)
                dMin = d[i];
        }
        System.out.println ("Максимальное число в массиве " + dMax);
        System.out.println ("Минимальное число в массиве " + dMin);
    }

    private static void fifthEx () {
        int[] [] e = new int [3][3];
        for (int i = 0; i < e.length; i++) {
            for (int j = 0, x = e[i].length - 1; j < e[i].length; j++, x--) {
                if (i == j || i == x) e[i][j] = 1;
                else e[i][j] = 0;
                System.out.print(e[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static boolean sixthEx () {
        int[] f = new int[6];

        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(f));
        int fRight = 0;
        int fLeft = 0;
        for (int i = 0; i < f.length - 1; i++){
            for (int z = i + 1; z < f.length; z++){
                fRight += f[i];
                fLeft +=f[z];
            }
            if (fRight == fLeft) return true;
            else return false;
        }
    }

    private static void seventhEx () {
        int[] g = new int[6];

        for (int i = 0; i < g.length; i++) {
            g[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(g));
        int n = - 2;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int m = g[g.length - 1];
                for (int h = g.length - 1; h > 0; h--){
                    g[h] = g[h - 1];
                }
                g[0] = m;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++){
                int m = g [0];
                for (int h = 0; h < g.length - 1; h++){
                    g[h] = g[h + 1];
                }
                g[g.length - 1] = m;
            }
        }
        System.out.println(Arrays.toString(g));
    }


    public static void main (String[] args) {

    }
}
