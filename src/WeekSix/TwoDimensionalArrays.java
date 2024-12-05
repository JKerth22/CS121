package WeekSix;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array1 = { {2,1,3,4}, {0,4,3,2}, {2,0,2,1}, {0,0,0,0} };
        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }
        System.out.println("\n");
        double array2[][] = new double[4][4];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + (j/10.0);
            }
        }
        for (double[] arrayCol : array2 ){
            System.out.println();
            for (double value : arrayCol) {
                System.out.print(value + "  ");
            }
        }
        System.out.println("\n");
        String[][] nameList = new String[2][3];
        nameList[0][0] = "James";
        nameList[0][1] = "Charles";
        nameList[0][2] = "Joe";
        nameList[1][0] = "Natalie";
        nameList[1][1] = "Olivia";;
        nameList[1][2] = "Sandra";
        for (int i = 0; i < nameList.length; i++) {
            System.out.println();
            for (int j = 0; j < nameList[i].length; j++) {
                System.out.print(nameList[i][j] + " ");
            }
        }
    }
}
