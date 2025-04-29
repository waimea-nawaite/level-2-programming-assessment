# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Board amount of boxes

I want for my board to have how many boxes the user wants

### Test Data To Use

Let the user choose a certain amount of boxes they want

### Expected Test Result

How many boxes do you want to play with?

e.g. User input = 10

---

## Board

I want the board to be layed out easy to see the coins

### Test Data To Use

I will print out the way I want it to and see if it comes out correctly

### Expected Test Result

+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+
| 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 |
+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+
| S  |    |    |    |    | G  | S  | S  |    | S  |    |    | S  |    |    |    |    |    |    |    |
+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+----+
If your reading this on preview mode the boxes look weird to fix it go into editor
---
## Winning

I want for the game to tell the players who won

### Test Data To Use

I will make the game say the gold coin has been removed to indicate that the player won.

### Expected Test Result

You have won the gold coin has been removed!


