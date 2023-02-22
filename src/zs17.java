public class zs17 {
    public static void main(String[] args) {

        // if n = 5
        // then
        // 1 2 6 7 15
        // 3 5 8 14 16
        // 4 9 13 17 22
        // 10 12 18 21 23
        // 11 19 20 24 25

        // here with the help of matrix
        // the series of numbers placed (i, j)
        // 00
        // 01 10 
        // 20 11 02
        // 03 12 21 30
        // 40 31 22 13 04
        // 14 23 32 41
        // 42 33 24
        // 34 43
        // 44

        // in odd lines each values (i decrements and j increments)
        // in even lines each values (i increments and j decrements)

        // first we have to make this pattern
        // then assign to its value in the array position

        final int n = 5;
        int arr[][] = new int[n][n];
        int row = 0; // row index
        int column = 0; // column index
        int c = 1; // count variable

        // to check odd line or even line
        boolean flag = true;

        arr[row][column] = c++;
        System.out.println(row + "" + column);

        // for upper part 
        for (int i = 0; i < n-1; i++) {
            if (flag)
                column++;
            else
                row++;
            flag = !flag;
            arr[row][column] = c++;
            System.out.print(row + "" + column +" ");
            for (int j = 0; j <= i; j++) {
                if (!flag) {
                    row++;
                    column--;
                } else {
                    row--;
                    column++;
                }
                System.out.print(row+""+column + " ");
                arr[row][column] = c++;
            }
            System.out.println("");
        }

        // for lower part
        for (int i = 0; i < n-1; i++) {
            if (flag) row++;
            else column++;
            flag=!flag;
            arr[row][column] = c++;
            System.out.print(row + "" + column +" ");
            for (int j = i; j < n-2; j++) {
                if (flag) {
                    row--;
                    column++;
                } else {
                    row++;
                    column--;
                }
                System.out.print(row+""+column + " ");
                arr[row][column] = c++;
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
