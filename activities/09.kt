import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
 	var read = Scanner(System.`in`)
    
    var num1 = read.nextInt()
    var num2 = read.nextInt()
    
    var total = sum(num1,num2)
    println("Sum of ${num1} and ${num2} is ${total}")
   
     
}
fun sum(a: Int, b: Int) : Int{
    return a+b
}