import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    // 現在の日付を取得
    val now = LocalDate.now()

    // 年、月、日を取得
    val year = now.year
    val month = now.monthValue
    val day = now.dayOfMonth

    // 年-月-日の形式で表示
    println("日付: $year-$month-$day")
}
