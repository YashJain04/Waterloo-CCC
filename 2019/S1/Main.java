// Waterloo CCC 2019 Senior 1 Contest
// Flipper problem

/* Code Logic:
- Store the box numbers in a 2D Array
- If user enters H switch the 2D Arrays indexes, so that it becomes a horizontal switch
- If user enters V switch the 2D Arrays indexes, so that it becomes a vertical switch
- Many different ways to approach problem such as if 2 letters are the same in a row then no switch would happen etc...
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
        Scanner s = new Scanner (System.in);
        String flipper = s.nextLine();

        int [] [] flipgrid = { {1, 2}, {3, 4} };

        for (int i = 0; i < flipper.length(); i++) {

            if (flipper.charAt(i) == 'H') {

                int positionUp1 = flipgrid [0] [0];
                int positionUp2 = flipgrid [0] [1];
                int positionDown1 = flipgrid [1] [0];
                int positionDown2 = flipgrid [1] [1];

                flipgrid [0] [0] = positionDown1;
                flipgrid [0] [1] = positionDown2;
                flipgrid [1] [0] = positionUp1;
                flipgrid [1] [1] = positionUp2;
            }

            if (flipper.charAt(i) == 'V') {

                int positionUp1 = flipgrid [0] [0];
                int positionUp2 = flipgrid [0] [1];
                int positionDown1 = flipgrid [1] [0];
                int positionDown2 = flipgrid [1] [1];

                flipgrid [0] [0] = positionUp2;
                flipgrid [0] [1] = positionUp1;
                flipgrid [1] [0] = positionDown2;
                flipgrid [1] [1] = positionDown1;

            }
        }

        System.out.print(flipgrid [0] [0] + " ");
        System.out.println(flipgrid [0] [1]);

        System.out.print(flipgrid [1] [0] + " ");
        System.out.println(flipgrid [1] [1]);

    }

}