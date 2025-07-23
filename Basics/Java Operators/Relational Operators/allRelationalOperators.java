public class allRelationalOperators {
  public static void main(String[] args) {
   // demo variables
   int demo1 = 100;
   int demo2 = 200;

   // using equal to (==) relational operator
   if(demo1 == demo2) {
    System.out.println(demo1 + " is equal to " + demo2 + ", equal to operator returning true value.");
   } else {
    System.out.println("Equal to operator returning false value.");
   }

   // second scenario using not equal to (!=) relational operator
   if(demo1 != demo2) {
    System.out.println(demo1 + " is not equal to " + demo2 + ", not equal to operator returning true value.");
   } else {
    System.out.println("Not equal to operator returning false value.");
   }

   // using greater than (>) relational operator
   if(demo1 > demo2) {
    System.out.println(demo1 + " is greater than " + demo2 + ", greater than operator returning true value.");
   } else {
    System.out.println("Greater than operator returning false value.");
   }

   // second scenario using less than (<) relational operator
   if(demo1 < demo2) {
    System.out.println(demo1 + " is less than " + demo2 + ", less than operator returning true value.");
   } else {
    System.out.println("Less than operator returning false value.");
   }

   // using greater than or equal to (>=) relational operator
   if(demo1 >= demo2) {
    System.out.println(demo1 + " is greater than or equal to " + demo2 + ", greater than or equal to operator returning true value.");
   } else {
    System.out.println("Greater than or equal to operator returning false value.");
   }

   // second scenario using less than or equal to (<=) relational operator
   if(demo1 <= demo2) {
    System.out.println(demo1 + " is less than or equal to " + demo2 + ", less than or equal relational operator returning true value.");
   } else {
    System.out.println("Less than or equal to operator returning false value.");
   }
  }
}
