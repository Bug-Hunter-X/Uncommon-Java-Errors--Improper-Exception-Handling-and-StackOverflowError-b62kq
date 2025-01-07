# Uncommon Java Errors

This repository demonstrates two types of uncommon errors in Java:

1. **Improper Exception Handling (ArithmeticException):** The code attempts to divide by zero and shows how to catch this exception but not handle it properly. A more robust solution would involve alternative logic.
2. **Unhandled StackOverflowError:** A recursive method without a base case leads to a StackOverflowError.  This shows the importance of base cases in recursive functions and proper error handling to prevent crashes.

The `UncommonErrorExample.java` file shows these errors, while `UncommonErrorSolution.java` provides improved exception handling and prevents the StackOverflowError.