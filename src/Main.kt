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
const val EMPTY = "---"


fun main() {
    println()
    println("Old Gold game 700")
    println("=================================================================================================================================================")
    println("This is a two-player game, played on a one-dimensional grid with coins, * where the aim is to win by being the player who removes the gold coin.")
    println("=================================================================================================================================================")

    println("Welcome to Old Gold!")
    println("Please enter your names for player 1 and 2: ")


    val coins = setUpBoxes()

    coins.add("Coin 1")
    coins.add("Coin 2")
    coins.add("Coin 3")
    coins.add("Coin 4")
    coins.add("Coin 5")
    coins.add("Gold")

    val player1 = readln()
    println("Player 1: $player1")

    val player2 = readln()
    println("Player 2: $player2")

    println("Placing coins into the Boxes...")

    coins.shuffle()
    listAllBoxes(coins)

    layOut(coins)
    println()

}

fun setUpBoxes(): MutableList<String> {
    val boxList = mutableListOf<String>()
    for (i in 1..NUMBOXES) boxList.add(EMPTY)
    return boxList
}

fun placeCoinInBox(boxList: MutableList<String>, boxNum: Int, name: String) {
    println("Putting $name into box $boxNum")
    boxList[boxNum - 1] = name
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

    println("+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+")
    for (i in 0..boxList.size - 1) {
        print("| ${boxList[i]}".padEnd(4))
    }
    println(" |")
    println("+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+")
}


