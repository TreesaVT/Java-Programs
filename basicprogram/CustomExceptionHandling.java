package basicprogram;

//Step 1: Create a custom exception class
public class InvalidAgeException extends Exception 
{
 public InvalidAgeException(String message) 
 {
     super(message);
 }
}

//Step 2: Use it in your code
public class CustomExceptionHandling 
{
 public static void checkAge(int age) throws InvalidAgeException 
 {
     if (age < 18) 
     {
         throw new InvalidAgeException("Age must be 18 or above to vote");
     } 
     else 
     {
         System.out.println("You are eligible to vote");
     }
 }

 public static void main(String[] args) {
     try {
         checkAge(15);
     } 
     catch (InvalidAgeException e) 
     {
         
       }
    }
}