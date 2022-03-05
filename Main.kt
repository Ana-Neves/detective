import kotlin.Boolean.Companion as Boolean1

fun main(args: Array<String>) {
detective()
}

fun detective():Unit {
    val points: Boolean = true
    val point0: Boolean = true
    val point1: Boolean = true
    val point2: Boolean = true
    val point3: Boolean = true
    val point4: Boolean = true
    val point5: Boolean = true

    val yes: Boolean = true
    val no: Boolean = true

    println("Answer only with Yes or No!!")

    println("Called the victim?")
    val victim = readLine()!!
    if(yes == point1) {
    } else(no == point0)

    println("Was at the local of crime?")
    val localOfCrime = readLine()
    if(yes == point1) {
    } else(no == point0)
    println("Lives close to the victim?")
    val closeTheVictim = readLine()
    if(yes == point1) {
    } else(no == point0)
    println("Owed money to the victim?")
    val owedMoney = readLine()
    if(yes == point1) {
    } else(no == point0)
    println("Already worked with the victim?")
    val workedWithMoney = readLine()
    if(yes == point1) {
    } else(no == point0)


        println("You made the total of {point} points:")

    if( 2 * point1) {
        println("Classified as Suspect!")
    }
    if( 3 * point1 || 4 * point1) {
        println("Classified as Accomplice!")
    }
    if( 5 * point1) {
        println("Classified as Assassin!")
    }
    if( 1 * point0)
        println("Classified as Innocent")



}

private operator fun Int.times(point1: Boolean): Boolean {
    var boolean1 = Boolean
    return false

}






