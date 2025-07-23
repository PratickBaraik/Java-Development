public class allVariables {
  public static void main(String[] args) {
    // java follows these variable rules
    /**
     * 1. variable names should contain letters, digits, underscores or dollar signs
     * 2. variable names can an alphanumeric word
     * 3. variable names shouldn't start with a digit
     * 4. variable names can start with underscore (_) or dollar sign ($) followed by alphabet character
     * 5. variable names are case sensitive
     * 6. variable names shouldn't be a reserved keyword
     * 7. variable names should be meaningful and descriptive
     * 8. variable names should not contain spaces
     * 9. variable names should not contain special characters like @, #, %, etc.
     * good examples: studentName, totalPrice, finalDiscount
     * possible examples: _initialValue, $computedBill, total_charge
     * not possible examples: 1stValue, @price, total price, final-discount
     */

    // declaring variables using var data type
    var firstName = "Pratick";
    System.out.println("First name: " + firstName);
    
    var lastName = "Baraik";
    System.out.println("Last name: " + lastName);

    System.out.println("Full name: " + firstName + " " + lastName);

    int _roll = 10001;
    System.out.println("Roll number: " + _roll);

    double $finalScore = 78.10;
    System.out.println("Final score: " + $finalScore);

    boolean long_boolean_variable_name = false;
    System.out.println("Long boolean variable name: " + long_boolean_variable_name);

    long largeNumber = 1234567891011123456L;
    System.out.println("Long number: " + largeNumber);
  }
}