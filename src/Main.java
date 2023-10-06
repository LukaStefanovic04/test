// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [][] niz2d = new int[][]{
                {1,2,8},
                {3,4,10},
                {5,6,15}
        };
        for (int i = 0; i < niz2d.length; i++) {
            for (int j = 0; j < niz2d[i].length; j++) {
                System.out.print(niz2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}