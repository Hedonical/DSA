import java.time.format.DateTimeFormatter
import java.time.LocalDate
import java.time.temporal.ChronoUnit



fun daydifference(start: String, end: String): Long {
    // define the string format we will parse dates from
    val dateFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    // parse the start date
    val startdate = LocalDate.parse(start, dateFormatter)
    // parse the end date
    val enddate = LocalDate.parse(end, dateFormatter)

    // return the number of days between the two dates
    return ChronoUnit.DAYS.between(startdate, enddate)

}


fun main() {
    println("The day difference is ${daydifference("01/01/2021", "01/01/2023")}")
}