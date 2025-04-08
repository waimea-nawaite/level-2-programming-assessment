/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Old Gold Game
 * Project Author: Ned Waite
 * GitHub Repo:    https://github.com/waimea-nawaite/level-2-programming-assessment
 * ---------------------------------------------------------------------
 * Notes:
 * This is a two-player game, played on a one-dimensional grid with coins,
 * where the aim is to win by being the player who removes the gold coin.
 * =====================================================================
 */

const val NUMBOXES = 20
const val EMPTY = "  "


fun main() {
    println()
    println("Old Gold game 700")
    println("=========================================================================")
    println("This is a two-player game, played on a one-dimensional grid with coins, |")
    println("* where the aim is to win by being the player who removes the gold coin.|")
    println("=========================================================================")

    println("Welcome to Old Gold!")
    println("Please enter your names for player 1 and 2: ")


    val coins = setUpBoxes()

    coins.add("S1")
    coins.add("S2")
    coins.add("S3")
    coins.add("S4")
    coins.add("S5")
    coins.add("G ")

    val player1 = readln()
    println("Player 1: $player1")

    val player2 = readln()
    println("Player 2: $player2")
    println()
    println("Player 1: $player1")
    println("Player 2: $player2")

    println("Placing coins into the Boxes...")

    listAllBoxes(coins)
    coins.shuffle()

    layOut(coins)
    println()

    moveCoin()


}




fun setUpBoxes(): MutableList<String> {
    val boxList = mutableListOf<String>()
    for (i in 1..NUMBOXES - 6) boxList.add(EMPTY)
    return boxList
}


fun listAllBoxes(boxList: List<String>) {
    for (i in 0..<boxList.size) {
        if (boxList[i] != EMPTY) {
            println("- ${boxList[i]}")
        }

    }

}
fun listEmptyBoxes(boxList: List<String>) {
    for (i in 0..<boxList.size) {
        if (boxList[i] == EMPTY) {
            println("- ${i + 1}")
        }

    }

}

fun layOut(boxList: List<String>) {


    println("+----".repeat(20) + "+")
    for (i in 0..boxList.size - 1) {
        print("| ${i + 1} ".padEnd(5))
    }
    println("|")
    println("+----".repeat(20) + "+")
    for (i in 0..boxList.size - 1) {
        print("| ${boxList[i]} ")
    }
    println("|")
    println("+----".repeat(20) + "+")

}


fun moveCoin(boxList: MutableList<String>, coinType: String): Any {
    
}





//fun removeACoin(coins: List<String>) {
//    var userInput = readln()
//    val remove = coins.removeAt(userInput)
//}