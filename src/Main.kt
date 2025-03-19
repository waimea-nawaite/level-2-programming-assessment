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
const val EMPTY = " "


fun main() {
    println()
    println("Old Gold game 700")
    println("=================================================================================================================================================")
    println("This is a two-player game, played on a one-dimensional grid with coins, * where the aim is to win by being the player who removes the gold coin.")
    println("=================================================================================================================================================")

    println("Welcome to Old Gold!")
    println("Please enter your names for player 1 and 2: ")

    val coins = setupBoxes()

    val player1 = readln()
    println("Player 1: $player1")

    val player2 = readln()
    println("Player 2: $player2")

    println("Placing coins into the Boxes...")





    layOut(coins)
    println()

}

fun setupBoxes(): MutableList<String> {
    val boxList = mutableListOf<String>()
    for (i in 1..NUMBOXES) boxList.add(EMPTY)
    return boxList
}

fun placeCoinInBox(boxList: MutableList<String>, boxNum: Int, name: String) {

}

fun layOut(boxList: List<String>) {

    println("+---+---+---+---+---+---+---+---+---+----+----+----+----+----+----+----+----+----+")
    for (i in 0..boxList.size - 1) {
        print("| ${i + 1} " .padEnd(4))
    }
    println("|")
    println("+---+---+---+---+---+---+---+---+---+----+----+----+----+----+----+----+----+----+")
}


