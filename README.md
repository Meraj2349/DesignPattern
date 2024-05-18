# Snake Game in C++

This project is a simple implementation of the classic Snake game using C++ and the graphics.h library. The objective of the game is to control the snake to eat fruits, which increases the length of the snake and the score. The game ends if the snake hits the wall or its own tail.

## Features

- Simple graphical interface.
- Score tracking.
- Randomly generated fruit positions.
- Snake grows as it eats the fruit.

## Requirements

To run this project, you need:

- A C++ compiler (like g++)
- graphics.h library
- conio.h library
- DOS emulator (if running on a modern operating system)

## How to Compile and Run

1. **Setup Graphics Library**: Ensure that the graphics.h library is properly set up in your development environment. This might involve configuring the BGI (Borland Graphics Interface) directory.

2. **Compile the Program**:
   ```sh
   g++ -o snake_game snake_game.cpp -lgraph

   How to Play
Use the following keys to control the snake:

W or w to move up.
A or a to move left.
S or s to move down.
D or d to move right.
The game starts with a snake of length 2.

Eat the fruit (represented as a blue rectangle) to grow the snake and increase your score.

Avoid hitting the walls or the snake's own tail, as this will end the game.

Game Flow
Start the Game: The game initializes the window and displays the initial score and the fruit.

Gameplay Loop: The game continues to run while the player is alive.

The snake moves in the current direction.
The game checks for collisions with the walls or the snake's tail.
The game updates the position of the fruit and the score.
Game Over: If the snake hits a wall or its own tail, the game ends, and a "YOU LOST" message is displayed along with the final score.

Code Overview
main(): The main function initializes the game and runs the game loop.
start(): Initializes game settings and the graphical window.
update(): Updates the game state every frame.
move(): Handles the movement of the snake based on user input.
graphic(): Renders the graphics on the screen.
fruit(): Manages the fruit's position and checks if the snake has eaten the fruit.
