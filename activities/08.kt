import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
   
    //Creating an array of strings -> myFriend and adding some names
    var myFriends = arrayOf("Khushi","Ali","Rahul","Isha")
    
    //Printing the name of all friends in myFriends using foreach loop
    for(name in myFriends){
        println(name)
    }

    //Printing the name and position of all friends in myFriends using foreach loop
    for((index,name) in myFriends.withIndex()){
        println("Friend ${index+1}: $name")
    }
     
    
}