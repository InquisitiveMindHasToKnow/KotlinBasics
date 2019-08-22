package demo

import java.lang.IllegalArgumentException
import java.util.Random

fun main() {
    println("Hello World")

    //immutable / unchangable / read only = vals

    val name = "Omar"

    //changeable variables = vars
    var myAge = 28

    //kotlin uses type inference so whatever you put after your equal sign will be what your variable
    //is considered by kotlin
    //above the name is a string, age is an integer

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)  // printing the old way
    println("Smallest Int: $smallInt") //printing with string interpolation // $

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long: " + bigLong)  // printing the old way
    println("Smallest Long: $smallLong") //printing with string interpolation // $

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double: " + bigDouble)  // printing the old way
    println("Smallest Double: $smallDouble") //printing with string interpolation // $

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float: " + bigFloat)  // printing the old way
    println("Smallest Float: $smallFloat") //printing with string interpolation // $

    var bigByte: Byte = Byte.MAX_VALUE
    var smallByte: Byte = Byte.MIN_VALUE

    println("Biggest Byte: " + bigByte)  // printing the old way
    println("Smallest Byte: $smallByte") //printing with string interpolation // $


    //when working with floating point numbers, there's a loss of precision after 15 digits

    var firstDouble: Double = 1.111111111111111
    var secondDouble: Double = 1.111111111111111

    println("Sum: " + (firstDouble + secondDouble)) // this prints the correct sum b/c its up to 15 digits after the decimal


    var firstDouble2: Double = 1.11111111111111111
    var secondDouble2: Double = 1.11111111111111111

    println("Sum: " + (firstDouble2 + secondDouble2)) //notice that the sum now ends in a 3....precision thrown off with 16th decimal number and above


    println("\n\n\n\n")


    //the keyword is is used to see if a variable is an integer, float, boolean or double
    //so the line below is checking to see if true is a boolean
    if (true is Boolean) {
        println("true is boolean")
    }


    var letterGrade: Char = 'A'
    println("Is A is a Char?: ${letterGrade is Char}") //another way of using string interpolation.


    // ***********Casting**************
    println("\n\t\t\t\t Casting \n")

    println("3.14 to Int : " + (3.14.toInt())) //this just converted 3.14 from a string to a double. wtf

    println("A to Int : " + letterGrade.toInt()) //letterGrade is A above and this line is converting it from a Char to an Int

    println("65 to Char : " + 65.toChar() + "\n\n") //converting the Int to a Char


    //*************Strings**************

    println("\t\t\t\t Strings and String Manipulation \n")

    val longString = """ This is a long String """

    var fName = "Jeremy"
    var lName = "Rayms"

    fName = "Sally"

    var fullName = fName + " " + lName
    println("Name: $fullName")

    println("1 + 2 = ${1 + 2}")

    println("String Length : ${longString.length}")

    //comparing strings

    var sentenceOne = "A random sentence"

    var sentenceTwo = "a random sentence"

    println("Strings Equal : ${sentenceOne.equals(sentenceTwo)}")//prints true or false

    println("Compare A to B : ${"A".compareTo("B")}") // prints a 0 if equal, negative will be a number < 0 and positive will be a number > 0

    println("2nd Index: ${sentenceOne.get(2)}")//getting a character at a specific index...2nd index in sentence one in this example
    println("2nd Index: ${sentenceOne[2]}")//this does the same thing as the line above. Use whichever you want

    println(
        "Index 2 - 7: ${sentenceOne.subSequence(
            2,
            8
        )}"
    )//Gets a substring using the indexes you put in. In this example you get indexes 2 to 7 even though 8 is in the param because indexes start at 0

    println("Contains random?: ${sentenceOne.contains("random")}")//Checking to see if a string contains another string

    println("\n\n\n ")

    //*************Arrays**************

    println("\t\t\t\t Arrays \n")

    val sentenceForCheckingIndexes = "Ohms The Resistance"

    var myArray = arrayOf(1, 1.23, "Ohms") //Arrays can store multiple values of multiple different data types

    println(myArray[2]) // printing what's in the 2nd index

    myArray[1] = 3.14 // changes the value of the first item in the array to 3.14

    println("Array Length: ${myArray.size}")//finding out how many elements are in array

    //println("Ohms in Array?: ${myArray.contains("Ohms")} ") //checking if Ohms is in an array
    println("Resistance In Sentence?: ${sentenceForCheckingIndexes.indexOf("Resistance")}")


    var partOfMyArray = myArray.copyOfRange(
        0,
        1
    )//get number of elements in an array and returning it as an array. This example is only doing the first two elements(0,1) but clearly, you can increment as you see fit

    println("First: ${myArray.first()}") // gets the first element of array
    println("Last: ${myArray.last()}") //gets last element of array

    //println("Ohms Index In myArray: ${myArray.indexOf("Ohms")}")
    println("Resistance Index In Sentence: ${sentenceForCheckingIndexes.indexOf("Resistance")}") //gets the first index for where Resistance shows up
    println("\n\n")

    var squareArray = Array(
        5,
        { x -> x * x }) //first param is the size of the array you want, the second, 1- 5 with each index value multiplying itself by itself


    println(squareArray[1])
    println(squareArray[2])
    println(squareArray[3]) //the 3rd element in the array, in this case 3, squared itself and printed 9
    println(squareArray[4])


    //Type Specific Arrays
    println("Type Specific Arrays")

    var intArray: Array<Int> = arrayOf(
        1,
        2,
        3,
        4
    ) // makes it so that you can only store ints in secondArray. If you try to store anything else, String or whatever, you can't
    var stringArray: Array<String> = arrayOf(
        "Apple",
        "Cake",
        "Pie",
        "Beef"
    )// makes it so that you can only store Strings in secondArray. If you try to store anything else, Int or whatever, you can't
    var doubleArray: Array<Double> = arrayOf(1.1, 2.4, 3.9, 4.16) // And so on and so forth


    //*************Ranges**************

    println("\t\t\t\t Ranges \n")//Define a starting and ending value and allows you to do calculations in between them

    val rangeFromOneToTen = 1..10 //automatically created a range incrementing from 1 to 10

    val alpha = "A".."Z"

    println("R in Alpha? : ${"R" in alpha}") //the keyword in checks to see if a certain item falls in a range or not

    val rangeFromTenToOne = 10.downTo(1) //creates a range from 10 to 1

    val rangeFromTwoToTwenty = 2.rangeTo(20) //creates a range from 2 to 20

    val rangeThree =
        rangeFromOneToTen.step(3) //goes through the rangeFromOneToTen range and adds 3 to every item so it goes from 1 > 4 > 7 > 10


    for (x in rangeThree) println("rangeThree: $x ")//Cycling through a range and printing information out

    println("\n")

    for (x in rangeFromTwoToTwenty)
        print("rangeFromTwoToTwenty: $x, ")

    println("\n")
    for (x in rangeFromTenToOne.reversed())
        println("Reverse rangeFromOneToTen: $x")//reversing a range. 10 to 1 now 1 to 10


    //*************Conditional Operators**************

    println("\t\t\t\t Conditional Operators \n")

    //> < >= <= == != && ||

    val age = 8

    if (age < 5) {
        println("Go to PreSchool")
    } else if (age == 5) {
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 15)) {
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

    //The when conditional operator in kotlin is akin to switch in java and other languages

    when (age) {
        0, 1, 2, 3, 4 -> println("Go to PreSchool") //in this example, if age is 0-4, then user

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }
        else -> println("Go to College")
    }

    //*************Looping**************

    println("\t\t\t\t Looping \n")

    //cycling through a range
    //for a range of 1 to 10, print x(being current item at time of said loop)
    for (x in 1..10) {
        println("Loop: $x")
    }

    println("\n")
    //use a while loop to guess random numbers

    val randomNumber = Random()
    val magicNumber =
        randomNumber.nextInt(50) + 1 //guesses a random number between 50. +1 added to include 50 in the range

    var guess = 0

    while (magicNumber != guess) {
        guess += 1
    }

    println("Magic Number was: $guess")
    println("\n")


    for (x in 1..20) {
        if (x % 2 == 0) {//if x is even
            continue // go back to the top of the loop and redo
        }
        println("Odd: $x") //prints all x values which will all be odd since we're skipping over even numbers above

        if(x == 15) break //same as switch break >>> jumps out of loop
    }


    var arrayForLoop: Array<Int> = arrayOf(3, 6, 9, 12)

    //iterating for the indexes of array
    for (i in arrayForLoop.indices)
        println("Multiples of 3: ${arrayForLoop[i]}")


    println("\n")

    //prints indexes and values of indexes
    for ((index, value) in arrayForLoop.withIndex()){
        println("Index: $index Value $value")
    }

    //*************Functions**************

    println("\n\t\t\t\t Functions \n")

    //starts with fun then function name, then list of params, their data type, then return type

    fun add(number1: Int, number2: Int) : Int = number1 + number2
    println("10 + 18 = ${add(10, 18)}")


    //you don't need a return type when working with a single line function so even though the below function is similar to the one above
    //note the Int at the end(return type is removed below
    //also, you can put the default values

    fun subtract(number1: Int = 25, number2: Int = 15) = number1 - number2
    println(subtract())

    println("20 - 12 = ${subtract(20, 12)}")


    println("4 - 5 = ${subtract(number2 = 5, number1 = 4)}")


    //if you don't have a return type, you put unit, not void

    fun sayHi(name: String) : Unit = println("Hello, $name")
    sayHi("Jeremy")



    //this uses the function nextTwo that's outside of main
    println("\n")
    val (two, three) = nextTwo(1) //two and three in this case are the variables that hold num+1 and num+2 in the nextTwo function. can be named whatever ----clearly

    println("1 $two $three")

    val (eight, nine) = nextTwo(7)
    println("7 $eight $nine")


    //this uses the function getSum that's outside of main
    println("Sum = ${getSum(1, 2, 3, 4, 5, 6, 7)}")


    //Defining function literals
    val multiply = {num1: Int, num2 : Int -> num1 * num2}
    println("8 * 6 = ${multiply(8, 6)}")


    //this uses the function fact that's outside of main
    println("8! = ${fact(8)}")
    println("5! = ${fact(5)}")
    println("3! = ${fact(3)}")


    //*************Higher Order Functions**************

    println("\n\t\t\t\t Higher Order Functions : A fuction that accepts or returns another function \n")


    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0} //if a function only has 1 parameter, you don't have to declare it. you can just use it

    evenList.forEach { n -> println(n) }// prints all the even values


    //calls a function that will dynamically return a created function

    val mult3 = makeMathFunction(8)
    println("8 * 4 = ${mult3(4)}")


    val mult = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1, 2, 3, 4, 5)

    mathOnList(numList2, mult)


    //*************Collection Operators**************

    println("\n\t\t\t\t Collection Operators \n")

    val exampleListOfNumbers = 1..20

    //sum all the values in a list uses the reduce function in kotlin
    val listSumWithReduce = exampleListOfNumbers.reduce {x, y -> x + y}
    println("Reduce Sum: $listSumWithReduce")

    //fold in this example starts with an initial value of 5 and will add all the other values in the list to it
    val listSumWithFold = exampleListOfNumbers.fold(5) {x, y -> x + y}
    println("Fold Sum: $listSumWithFold")


    //check if any values are able to meet a condition
    println("Checking Evens:  ${exampleListOfNumbers.any { it % 2 == 0 }}") //this example checks if ANY even numbers are in exampleListOfNumbers
    println("Checking Evens:  ${exampleListOfNumbers.all { it % 2 == 0 }}") //this example checks if ALL numbers in exampleListOfNumbers are even


    val numsLargerThanThree = exampleListOfNumbers.filter { it > 3 }
    numsLargerThanThree.forEach { n -> println("Numbers > 3 in exampleListOfNumbers are: $n") }


    //map operator allows you to perform an action on every single item and return a new list

    val timesEight = exampleListOfNumbers.map { it * 8 }//multiplies every element in exampleListOfNumbers by 8
    timesEight.forEach { n -> println("Values in exampleListOfNumbers * 8 = $n") }


    //*************Exception Handling**************

    println("\n\t\t\t\t Exception Handling \n")

    val divisor = 2

    try{
        if(divisor == 0){

            throw IllegalArgumentException("Can't divide by zero")
        }else {
            println(" 10 / $divisor = ${10/divisor}")
        }
    }catch (e: IllegalArgumentException){
        println(e.message)
    }


    //*************Collections**************

    println("\n\t\t\t\t Collections \n")
    println("\t\t\t\t Lists \n")

    //There are mutable and immutable lists in kotlin

    var mutableListExample: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)

    val immutableListExample: List<Int> = listOf(10, 20, 30, 40, 50)

    mutableListExample.add(6) //adds 6 to mutableListExample
    println("First item in mutableListExample:  ${mutableListExample.first()}")
    println("Last item in mutableListExample:  ${mutableListExample.last()}")

    println("2nd Index of mutableListExample:  ${mutableListExample[2]}")

    //creates a new list from index 0 - 3 of mutableExampleList using subList keyword
    var anotherMutableListExample = mutableListExample.subList(0, 3)
    println("Length of mutableListExample =   ${mutableListExample.size}")


    anotherMutableListExample.clear() //removes all items from anotherMutableListExample

    mutableListExample.remove(2) // removes the 2nd element in mutableListExample

    mutableListExample.removeAt(1) // removes the item at index 1 in mutableListExample

    mutableListExample[2] = 10 //adds 10 to mutableListExample at the 2nd index

    mutableListExample.forEach {n -> println("Mutable List Example Items: $n")}//cycles through and prints all items in mutableListExample


    println("\t\t\t\t Maps \n")
    //modifiable collection that holds key value pairs
    //can be mutable or immutable in kotlin

    val mutableMapExample = mutableMapOf<Int, Any?>()//in this example the key will be an Int, the value can be anything

    //map that loads values when you first start it
    //1 to Ohms is the key in this example, 2 to 25 being the value
    //note the absence of the < > which is allowing kotlin to figure out what they are
    val map = mutableMapOf(1 to "Ohms", 2 to 25)

    //adding values to a map
    //Dexter is the key in this example, 50 is the value
    map[1] = "Dexter"
    map[2] = 50

    println("Map Size: ${map.size}")

    //adding a key value pair
    map.put(3, "Brooklyn")

    //removing a key and value
    map.remove(2)// removes the item at 2nd key in this example

    //iterating to get key value pairs

    for((x, y) in map ){

        println("Key: $x Value: $y")
    }


    println("\t\t\t\t Classes \n")



}





//receives a number and returns the next two in line
fun nextTwo(num: Int) : Pair<Int, Int>{
    return Pair(num+1, num+2)
}


//send a variable number of parameters
fun getSum(vararg nums: Int) : Int{
    var sum = 0

    //forEach allows you to cycle through an array
    nums.forEach { n -> sum += n  }//cycles through every value in the array and adds them to the value of sum
    return sum
}

//calculate a factorial with tail recursion
//function below will call itself until y = 0
fun fact(x: Int): Int {

    tailrec fun factTail(y: Int, z: Int): Int {

        if (y == 0) return z
            else return factTail(y-1, y * z)
    }
    return factTail(x, 1)
}

//function that will dynamically return a created function
//multiplies values times values passed in
//essentially function that will multiply values by num1

fun makeMathFunction(num1: Int): (Int) -> Int = {num2 -> num1 * num2}


//receives a list and a function to use on the list
fun mathOnList(numList: Array<Int>, myFunction: (num: Int) -> Int){

    for(num in numList){
        println("MathOnList ${myFunction(num)}")
    }

}
