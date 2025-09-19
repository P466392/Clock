/*
    TODO: Class variables to store: hours (0-23), minutes (0-59), seconds (0-59).
    TODO: Primary constructor (No parameters): Initializes the hours, minutes, and seconds to 0.
    TODO: Secondary constructor: Initializes the hours, minutes, and seconds using parameters entered by user.
    TODO: Method1: Reset the hours, minutes and seconds back to 0.
    TODO: Method2: Advance the clock by 1 second.
    */

fun main() {
    val clock = Clock(0,0,0)
    var option = ""

    while (option != "q") {
        println("Current time: ${clock.displayTime()}")
        println("Enter 's' to set the time.")
        println("Enter 'a' to advance one second.")
        println("Enter 'r' to reset the clock.")
        println("Enter 'q' to quit")
        option = readln()

        when (option) {
            "s" -> {
                print("Enter hour (0-23): ")
                val h = readln().toInt()
                print("Enter minute(s) (0-59): ")
                val m = readln().toInt()
                print("Enter second(s) (0-59): ")
                val s = readln().toInt()
                clock.hour = h
                clock.minute = m
                clock.second = s
            }
            "a" -> {
                clock.addOneSecond()
            }
            "r" -> {
                clock.resetClock()
            }
            "q" -> {
                println("Goodbye!")
            }
            else -> {
                println("Invalid option.")
            }
        }
    }
}