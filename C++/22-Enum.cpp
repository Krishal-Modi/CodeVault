#include <iostream>

enum Color {
    RED,
    GREEN,
    BLUE
};

int main() {
    Color myColor = GREEN;

    if (myColor == GREEN) {
        std::cout << "The color is green!" << std::endl;
    }

    return 0;
}

