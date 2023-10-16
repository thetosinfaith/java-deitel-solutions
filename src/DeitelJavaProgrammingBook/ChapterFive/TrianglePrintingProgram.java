package DeitelJavaProgrammingBook.ChapterFive;

//5.15 (Triangle Printing Program)

/*
Write an application that displays the following patterns separately, one below the other. Use for loops to generate the patterns.
All asterisks (*) should be printed by a single statement of the form System.out.print('*'); which causes the asterisks to print side by side.
A statement of the form System.out.println(); can be used to move to the next line.
A statement of the form System.out.print(' '); can be used to display a space for the last two patterns.
There should be no other output statements in the program.
[Hint: The last two patterns require that each line begin with an appropriate number of blank spaces.]


(a)       (b)            (c)        (d)
*      **********     **********     *
**      *********     *********     **
***      ********     ********     ***
****      *******     *******     ****
*****      ******     ******     *****
******      *****     *****     ******
*******      ****     ****     *******
********      ***     ***     ********
*********      **     **     *********
**********      *     *     **********

*/

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("*");

            }
            System.out.println();

        }

                for (int row = 0; row < 10; row++) {
                    for (int column = 0; column < row; column++) {
                        System.out.println("*");

                    }
                    System.out.println();

                }

                for (int row = 0; row < 10; row++){
                    for (int column = 0; column < row; column++){
                        System.out.println("*");

                    }
                    System.out.println();

                }

                for (int row = 0; row < 10; row++){
                    for ()
                }

            }

        }




