package  Clock

class Clock {
    private var Hour = 0
    private var Minute = 0
    private var Second = 0

    fun defaultClock() {
        Hour = 0
        Minute = 0
        Second = 0
        val time = ("$Hour:$Minute:$Second")
    }

    constructor (hour: Int, minute: Int, second: Int) {
        this.Hour = hour
        this.Minute = minute
        this.Second = second
    }

    fun add(hour: Int, minute: Int, second: Int) {
        this.Second = second + 1
        println("$hour:$minute:$second")
    }
}