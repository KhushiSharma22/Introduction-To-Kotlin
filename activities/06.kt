import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
    var read = Scanner(System.`in`)
    
    println("Enter your age")
  	var age = read.nextInt()
    
    /*
     * Checking age with when
     */
     
     when(age){
         in 1..17 -> println("You are below 18")
         in 18..80 -> println("You are above 18")
         else -> {
             println("Not in range")
         }
     }
     
    
}