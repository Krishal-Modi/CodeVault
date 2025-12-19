#include <stdio.h>

int fibo(int n) {
    if (n == 0) return 0;  // Base case
    if (n == 1) return 1;  // Base case
    return fibo(n - 1) + fibo(n - 2);  // Recursive case
}

int main() {
    printf("%d", fibo(10));  // Calling Fibonacci function with n=10
    return 0;
}

