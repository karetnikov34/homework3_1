fun main () {
    val time = agoToText(19999)
}
fun agoToText (time: Int) {
    when(time)  {
        in 0..60 -> println("был(а) только что")
        in 61..60*60 -> minute((time -1) / 60)
        in 60*60+1..24*60*60 -> hour((time -1) / 60 / 60)
        in 24*60*60+1..48*60*60 -> println("был(а) в сети вчера")
        in 48*60*60+1..72*60*60 -> println("был(а) в сети позавчера")
        else -> println("был(а) в сети давно")
    }
}

fun minute(time: Int) {
    when(time) {
        1,21,31,41,51 -> println("был(а) $time минуту назад")
        2,3,4,22,23,24,32,33,34,42,43,44,52,53,54 -> println("был(а) $time минуты назад")
        else -> println("был(а) $time минут назад")
    }
}

fun hour(time: Int) {
    when(time) {
        1,21 -> println("был(а) в сети $time час назад")
        2,3,4,22,23 -> println("был(а) в сети $time часа назад")
        else -> println("был(а) в сети $time часов назад")
    }
}