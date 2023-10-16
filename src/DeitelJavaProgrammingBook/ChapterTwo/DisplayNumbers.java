package DeitelJavaProgrammingBook.ChapterTwo;

/*
Write an application that displays the numbers 1 to 4 on the same line, with each pair of
adjacent numbers separated by one space. Use the following techniques:
a) Use one System.out.println statement.
b) Use four System.out.print statements.
c) Use one System.out.printf statement.
 */

public class DisplayNumbers {
    public static void main(String[] args) {

        int One = 1;
        int Two = 2;
        int Three = 3;
        int Four = 4;

        System.out.println("1  2 3 4" );

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

        System.out.printf("%d, %d, %d, %d", 1, 2, 3, 4);
    }
}
