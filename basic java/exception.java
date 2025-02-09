 public class MyClass {
      public static void main(String[] args) {
           try {
               int data = 50 / 0; // throws exception   
               // the next statement will not execute  
               System.out.println("Will not execute!");
           }
           // Choosing appropriate handler   
           catch (IndexOutOfBoundsException e1) {
               System.out.println("Not appropriate handler!");
           } catch (ArithmeticException e2) {
               System.out.println("Appropriate handler!");
           } catch (IOException e3) {
               System.out.println("Appropriate handler but not executed");
           } finally {
              System.out.println("Executed whether there is exception or not");
           }
           System.out.println("Executed!");
      }
 }


     