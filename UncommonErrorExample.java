public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            //In this case, we are not handling this exception correctly, and it could lead to unpredictable results.
            // Instead of simply printing the message, additional actions should be taken to gracefully handle the situation.
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }

        String str = null;
        //NullPointerException - this exception is handled
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            //Proper handling is implemented here by printing a message indicating the null pointer exception.
            //A common solution is to check for null values before performing operations that might throw this exception.
        }
        //StackOverflowError - this is not handled
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod(); // Recursive call without base case
    }
}