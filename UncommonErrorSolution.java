public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero!");
            //Handle the exception gracefully, e.g., use a default value
            int result = 0; // Or handle appropriately based on context
            System.out.println("Using default value: " + result);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: String is null.");
            //Handle null case.
            int length = 0;
        }

        //Preventing StackOverflowError
        safeRecursiveMethod(0, 5); 
    }

    public static void safeRecursiveMethod(int count, int limit) {
        if (count < limit) {
            System.out.println("Recursion level: " + count);
            safeRecursiveMethod(count + 1, limit); 
        }
    }
}