public class allBitwiseOperators {
  public static void main(String[] args) {
    // useful variables to perform bitwise operations
    int a = 60; // (60)10 = (0011 1100)2
    int b = 20; // (20)10 = (0001 0100)2
    int result = 0;

    // bitwise AND operator (&) A * B
    result = a & b; // multiplying the bits of a = 60 (0011 1100) and b = 20 (0001 0100)
    /* (60)10 = (0011 1100)2
     * (20)10 = (0001 0100)2
     * ---------------------
     * (60)10 = (0011 1100)2 
     ************************/
    System.out.println("Bitwise AND opertion result of 60 and 20 is: " + result);

    // bitwise OR operator (|) A + B
    result = a | b; // adding the bits of a = 60 (0011 1100) and b = 20 (0001 0100)
    /* (60)10 = (0011 1100)2
     * (20)10 = (0001 0100)2
     * ---------------------
     * (60)10 = (0011 1100)2 
     ************************/
    System.out.println("Bitwise OR opertion result of 60 and 20 is: " + result);

    // bitwise XOR operator (^) A ^ B
    result = a ^ b; // XORing the bits of a = 60 (0011 1100) and b = 20 (0001 0100)
    /* (60)10 = (0011 1100)2
     * (20)10 = (0001 0100)2
     * ---------------------
     * (40)10 = (0010 1000)2
     ************************/
    System.out.println("Bitwise XOR opertion result of 60 and 20 is: " + result);

    int posValue = 2; // (2)10 = (0000 0010)2

    // bitwise NOT operator (~) ~posValue
    result = ~posValue; // negetion of the bits of posValue (2)10 = (0000 0010)2
    /* (2)10 = (0000 0010)2
     * --------------------
     * 
     */ 
  }  
}
