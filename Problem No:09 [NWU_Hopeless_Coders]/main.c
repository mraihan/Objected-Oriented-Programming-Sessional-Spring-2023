#include <stdio.h>
#include <stdlib.h>

#define MAX_N 10010

int n, m, q, r, c;
int a[MAX_N][MAX_N];

void rotate1(int x, int y)
{
    int t = a[x-1][y-1];
    a[x-1][y-1] = a[x][y-1];
    a[x][y-1] = a[x+1][y-1];
    a[x+1][y-1] = a[x+1][y];
    a[x+1][y] = a[x+1][y+1];
    a[x+1][y+1] = a[x][y+1];
    a[x][y+1] = a[x-1][y+1];
    a[x-1][y+1] = a[x-1][y];
    a[x-1][y] = t;
}

int main()
{
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            scanf("%d", &a[i][j]);

    scanf("%d", &q);
    while (q--) {
        scanf("%d%d", &r, &c);
        rotate1(r, c);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                printf("%d ", a[i][j]);
            printf("\n");
        }
    }

    return 0;
}

