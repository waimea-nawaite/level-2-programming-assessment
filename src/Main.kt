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
const val SILVER = "S "
const val GOLD = "G "



fun main() {
    println()
    println("Old Gold game 700")
    println("=========================================================================")
    println("This is a two-player game, played on a one-dimensional grid with coins, |")
    println("* where the aim is to win by being the player who removes the gold coin.|")
    println("")
    println("=========================================================================")

    println("Welcome to Old Gold!")
    println("Please enter your names for player 1 and 2: ")


    val board = setupGame()

    //The players names
    print("Player 1, enter your name: ")
    val player1 = readln()
    print("Player 2, enter your name: ")
    val player2 = readln()

    println("Player 1: $player1")
    println("Player 2: $player2")

    println("Placing coins onto the board...")

    showBoard(board)
    println()

    var playerTurn = player1
    while (true) {
        println("$playerTurn's turn...")

        val coinIndex = getCoin(board)
        // Check if 0...???
        if (coinIndex == 0) 



        // else
        val newPosition = getMove(board)

        // move the coin
        board[newPosition] = board[coinIndex]
        board[coinIndex] = EMPTY

        playerTurn = if (playerTurn == player1) player2 else player1
    }
}




//How the boxes are setup
fun setupGame(): MutableList<String> {
    val boxList = mutableListOf<String>()

    val numSilver = 5
    val numGold = 1
    val numSpaces = NUMBOXES - numSilver - numGold

    for (i in 1..numSpaces) boxList.add(EMPTY)
    for (i in 1..numSilver) boxList.add(SILVER)
    boxList.add(GOLD)

    boxList.shuffle()

    return boxList
}

//Lists the coins in order
//fun listAllCoins(boxList: List<String>) {
//    for (i in 0..<boxList.size) {
//        if (boxList[i] != EMPTY) {
//            println("- ${boxList[i]}")
//        }
//
//    }
//
//}


fun showBoard(boxList: List<String>) {


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


fun getCoin(board: List<String>): Int {
    while(true) {
        println("Please enter the index of the coin you want to move (1-${board.size}):")
        val coinIndex = readln().toIntOrNull()?.minus(1) ?: continue

        if (coinIndex < 0 || coinIndex >= board.size || board[coinIndex] == EMPTY) {
            println("Invalid coin selection. Please try again.")
        }
        else {
            return coinIndex
        }
    }
}
fun getMove(board: List<String>): Int {

}

{
    println("Please enter the new position (1-${coins.size}):")
    val newPosition = readln().toIntOrNull()?.minus(1) ?: continue

    if (newPosition < 0 || newPosition >= coins.size || coins[newPosition] != EMPTY) {
        println("Invalid move. The target position is either out of bounds or not empty. Please try again.")
        continue
    }

    // Move the coin
    coins[newPosition] = coins[coinIndex]
    coins[coinIndex] = EMPTY

    showBoard(coins)
    println()

    // Check for win
    if (coins[newPosition] == "G") {
        println("$playerTurn has removed the gold coin! $playerTurn wins!")
        break
    }

    // Switch players


}





//fun removeACoin(coins: List<String>) {
//    var userInput = readln()
//    val remove = coins.removeAt(userInput)
//}