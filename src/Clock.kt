class Clock {
    private var hour: Int = 0
    private var minute: Int = 0
    private var second: Int = 0

    constructor(hour: Int, minute: Int, second: Int) {
        this.hour = hour
        this.minute = minute
        this.second = second
    }

    fun ResetClock() {
        hour = 0
        minute = 0
        second = 0
    }

    fun addOneSecond(){
        second++
        if (second >= 60){
            second = 0
            minute++
            if (minute >= 60){
                minute = 0
                hour++
                if (hour >= 24){
                    hour = 0
                }
            }
        }
    }

    fun displayTime(): String{
        return String.format("%02d:%02d:%02d", hour, minute, second)
    }
}