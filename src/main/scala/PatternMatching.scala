import scala.io.StdIn.readLine

object PatternMatching extends App {

  def getDayOfWeek (dayIndex: Int):String = dayIndex match {
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case _ => "Unknown weekday"
  }
  for (day <- 0 to 8) println(getDayOfWeek(day))
  val dayOff = readLine ("What day of the week do you want to take off?").trim.toInt
  val dayWeek =  getDayOfWeek(dayOff)
  val dayOffs = dayWeek
  println(s"Okay, $dayWeek will be a holiday for you, but only once :) ")
}
