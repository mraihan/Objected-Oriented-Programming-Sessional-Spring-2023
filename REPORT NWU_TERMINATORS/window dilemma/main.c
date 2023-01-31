#include <stdio.h>
#include <stdlib.h>

int main() {
    float t;
    scanf("%f", &t);
    while (t--) {
        float w, g;
        scanf("%f %f", &w, &g);
        float emptySpace = (w - g) / 2;
        printf("%f\n", emptySpace);
    }
    return 0;
}
