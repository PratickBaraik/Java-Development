public class allLogicalOperators {
  public static void main(String[] args) {
    int num1 = 100;
    int num2 = 300;

    boolean result1 = false;
    boolean result2 = false;
    boolean result3 = false;

    // logical && operator (AND operator)
    if(num1 < num2 && num2 < 50) {
      result1 = true;
      System.out.println(num1 + " is less than " + num2 + " and " + num2 + " is less than 50");
      System.out.println("Result1 :" + result1);
    } else {
      System.out.println("first combined condition is false.");
    }

    // logical || operator (OR operator)
    if(num1 < num2 || num2 < 50) {
      result2 = true;
      System.out.println(num1 + " is less than " + num2 + " or " + num2 + " is less than 50");
      System.out.println("Result2 :" + result2);
    } else {
      System.out.println("second combined condition is false.");
    }

    // logical ! operator (NOT or negation operator)
    if(!result1 && !result2) {
      result3 = true;
      System.out.println("Result3 :" + result3);
    } else {
      System.out.println("NOT operator or negetion operator condition is returning false");
    }
  }  
}
