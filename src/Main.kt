import kotlin.math.E

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
//constant values
const val NUMBOXES = 20
const val EMPTY = "  "
const val SILVER = "S "
const val GOLD = "G "



fun main() {
    println()
    println("Old Gold game 700")
    println("====================================================================================================")
    println("This is a two-player game, played on a one-dimensional grid with coins, |")
    println("Rules: You can ONLY move a coin to the left how many boxes you want but WITHOUT")
    println("jumping over another coin. When you have a coin in box 1 to remove it select the coin in the box then type 1.")
    println("Removing any coin counts as a turn so play smart")
    println("Who ever removes the gold coin wins the game. GOODLUCK!")
    println("====================================================================================================")

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
    //Loop for main game
    var playerTurn = player1
    while (true) {
        println("$playerTurn's turn...")

//this checks if the gold coin has been removed and removes the silvers
        val coinIndex = getCoin(board)
        // Check if 0...???
        if (coinIndex == 0) {
            if (board[0] == "G ") {
                board[0] = EMPTY
                println("Game finished! The gold coin has been removed!")
                println("Congratulations! Restart the game to play again")
                break

            }
            if (board[0] == "S ") {
                board[0] = EMPTY

            }
        }


        val newPosition = getMove(board)


        // moves the coin with the players input
        board[newPosition] = board[coinIndex]
        board[coinIndex] = EMPTY

        showBoard(board)
        println()

        //swaps players turns
        playerTurn = if (playerTurn == player1) player2 else player1
    }
}




//How the boxes are setup with the coins randomly placed inside
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

//This makes the board layout for the coins and boxes
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

//This asks the user what coin they want to move and if its an invalid input it asks again
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
//This asks the user where they want to move the coin they have selected and if its invalid then asks again
fun getMove(board: List<String>): Int {
    while (true) {
        println("Please enter the new position")
        val newPosition = readln().toIntOrNull()?.minus(1) ?: continue

        if (newPosition < 0 || newPosition >= board.size || board[newPosition] != EMPTY) {
            println("Invalid position. Please try again.")

        }
        else {
            return newPosition
        }
    }
}
