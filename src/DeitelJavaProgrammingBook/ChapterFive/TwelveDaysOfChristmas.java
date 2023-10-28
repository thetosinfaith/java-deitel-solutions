package DeitelJavaProgrammingBook.ChapterFive;

//5.29 (“The Twelve Days of Christmas” Song)

/*
Write an application that uses iteration and switch
statements to print the song “The Twelve Days of Christmas.” One switch statement should be
used to print the day (“first,” “second,” and so on). A separate switch statement should be used to
print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
of_Christmas_(song) for the lyrics of the song.
 */
public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        for (int i = 1; i < 13; i++) {

            switch (i) {
                case 1 -> System.out.println("""
                        On the first day of Christmas, my true love sent to me
                        A partridge in a pear tree
                        """);

                case 2 -> System.out.println("""
                        On the second day of Christmas my true love sent to me
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);

                case 3 -> System.out.println("""
                        On the third day of Christmas my true love sent to me
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);

                case 4 -> System.out.println("""
                        On the fourth day of Christmas my true love sent to me
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);

                case 5 -> System.out.println("""
                        On the fifth day of Christmas my true love sent to me
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);

                case 6 -> System.out.println("""
                        On the sixth day of Christmas my true love sent to me
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);

                case 7 -> System.out.println("""
                         On the seventh day of Christmas my true love sent to me
                         Seven swans a-swimming
                         Six geese a-laying
                         Five golden rings
                         Four calling birds
                         Three french hens
                         Two turtle doves, and
                         A partridge in a pear tree
                        """);

                case 8 -> System.out.println("""
                         On the eighth day of Christmas my true love sent to me
                         Eight maids a-milking
                         Seven swans a-swimming
                         Six geese a-laying
                         Five golden rings
                         Four calling birds
                         Three french hens
                         Two turtle doves, and
                         A partridge in a pear tree
                        """);

                case 9 -> System.out.println("""
                        On the ninth day of Christmas my true love sent to me
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);

                case 10 -> System.out.println("""
                         On the tenth day of Christmas my true love sent to me
                         Ten lords a-leaping
                         Nine ladies dancing
                         Eight maids a-milking
                         Seven swans a-swimming
                         Six geese a-laying
                         Five golden rings
                         Four calling birds
                         Three french hens
                         Two turtle doves, and
                         A partridge in a pear tree
                        """);

                case 11 -> System.out.println("""
                        On the eleventh day of Christmas, my true love sent to me
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three French hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);

                case 12 -> System.out.println("""
                        On the twelfth day of Christmas, my true love sent to me
                        Twelve drummers drumming
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three French hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
            }

        }

    }

}

