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
