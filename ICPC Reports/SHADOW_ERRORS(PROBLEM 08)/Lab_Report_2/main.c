#include <stdio.h>
#include <string.h>
int main() {
    char s[100];
    printf("Enter Anything Above Mentioned: ");
    while(scanf("%s", s) == 1) {
        int len = strlen(s);
        int i, j;
        char a[] = "A   3  HIL JM O   2TUVWXY5";
        char b[] = "01SE Z  8 ";
        int var1 = 0, reg1 = 0;
        for(i = 0, j = len-1; i <= j; i++, j--) {
            if(s[i] != s[j])
                var1 = 1;
            if(s[i] >= 'A' && s[i] <= 'Z') {
                if(s[j] != a[s[i]-'A'])
                    reg1 = 1;
            } else {
                if(s[j] != b[s[i]-'0'])
                    reg1 = 1;
            }
        }
        printf("%s -- is ", s);
        if(var1) {
            if(reg1)
                puts("Not Palindrome.");
            else
                puts("This is A Mirrored String.");
        } else {
            if(reg1)
                puts("This is A Regular Palindrome.");
            else
                puts("This is A Mirrored Palindrome.");
        }
        puts("");
    }
    return 0;
}
