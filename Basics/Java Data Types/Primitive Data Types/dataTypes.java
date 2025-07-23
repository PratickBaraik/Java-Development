public class dataTypes {
  public static void main(String[] args) {
    byte negByte = -128; // Byte type can hold values from -128 to 127
    System.out.println("Byte negative value: " + negByte);
    byte posByte = 127; 
    System.out.println("Byte positive value: " + posByte);
    short negShort = -32768; // Short type can hold values from -32768 to 32767
    System.out.println("Short negative value: " + negShort);
    short posShort = 32767;
    System.out.println("Short positive value: " + posShort);
    int negInt = -2147483648; // Integer type can hold values from -2147483648 to 2147483647
    System.out.println("Integer negative value: " + negInt);
    int posInt = 2147483647;
    System.out.println("Integer positive value: " + posInt);
    long negLong = -9223372036854775808L; // Long type can hold values from -9223372036854775808 to 9223372036854775807
    System.out.println("Long negative value: " + negLong);
    long posLong = 9223372036854775807L;
    System.out.println("Long positive value: " + posLong);
    float negFloat = -4.5f; // Float type can hold values with decimal points
    System.out.println("Float negative value: " + negFloat);
    float posFloat = 4.5f;
    System.out.println("Float positive value: " + posFloat);
    double doubleValue = 2.12334788992740; // Double type can hold larger decimal values
    System.out.println("Double value: " + doubleValue);
    char firstLetter = 'A';
    System.out.println("First character value: " + firstLetter);
    char lastLetter = 'Z';
    System.out.println("Last character value: " + lastLetter);
    boolean isTrue = true; // Boolean type can hold true or false
    System.out.println("Boolean true value: " + isTrue);
    boolean isFalse = false;
    System.out.println("Boolean false value: " + isFalse);
    String message = "This is a short string message.";
    System.out.println("String message: " + message);
  }
}
