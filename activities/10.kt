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
    
   
    
    println("Older age: ${olderAge(age1,age2)}")
   
     
}
fun olderAge(a: Int, b: Int) : Int{
    if(a>b) return a else return b
}
