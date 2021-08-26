import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
   //Taking input from user using readLine() function
    //We can also use Scanner class after importing from java.util package
    
    var read = Scanner(System.`in`)
    
    println("Enter your age")
  	var age = read.nextInt()
    
    print("Age: ${age}")
    
    /*
     * Checking age with if else
     */
     if(age>18){
         println("Valid age")
     }else{
         println("Not valid")
     }
     
    
}