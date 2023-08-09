public class Main {
    public static void main(String args[]){
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */
        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);

        System.out.println (9 - 4) = 5
        System.out.println (10/2) = 5
        System.out.println (4 - 8) = -4
        System.out.println (4 - 8) / 3 = -4 / 3 = -1.3 (repeating)
        System.out.println original expression = 5 + 5 - (-1.3333)
        System.out.println 10 - (-1.3) which = 11.3
                = 11.3;

        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));

        System.out.println 23 % 4 = 23/4 = 3
        System.out.println (18 - 3 / 2) = 3 / 2 is evaluated 1st = 1.5
                expression becomes: 3 + (18 - 1.5)
        System.out.println 18 - 1.5 = 16.5
                final expression = 3 + 16.5
                = 19.5

        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));

        System.out.println (8 - 5) = 3
        System.out.println Math.pow(3, 4) = 81.
        System.out.println 81 / 5 = 16.2
        System.out.println 3 + 16.2
            final expression
                = 19.2

        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));

        System.out.println (9 % 4) = 1.
        System.out.println Math.pow(2, 3) = 8
        System.out.println Math.sqrt(81) = 9
        System.out.println 1 - 8 + 8 / 8 + (9 / 3)
            System.out.println 8 / 8 = 1
        System.out.println (9 / 3) = 3
        System.out.println 1 - 8 + 1 + 3
        System.out.println 1 - 8 = 7
        System.out.println -7 + 1 = -6
        System.out.printl -6 + 3
                = -3

        //Expression 5

        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));

        System.out.println 14 / 2 = 7
        System.out.println 7 + 3 = 10
        System.out.println Math.sin(45) ≈ 0.71
            System.out.println(10 * 0.70710678118) = 7.0710678118
                System.out.println 7.0710678118 + 2 = 9.0710678118
                System.out.println Math.sqrt(25) = 5
        System.out.println Math.pow(5, 3) = 125
        System.out.println expression becomes 9.0710678118 - 125
        System.out.println 9.0710678118 - 125
            ≈ -115.9289321882
