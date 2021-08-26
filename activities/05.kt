import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
    
    var read = Scanner(System.`in`)
    
    println("Enter first persons age")
  	var age1 = read.nextInt()
    
    println("Enter second persons age")
  	var age2 = read.nextInt()
    
    var elder = if(age1>age2) age1 else age2
    
    println("Older age: $elder")
     
     
    
}