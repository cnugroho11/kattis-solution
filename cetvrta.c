#include <stdio.h>
#include <stdlib.h>

void main()
{
    int x1, x2, x3, y1, y2, y3;
    int x4,y4;
    scanf("%i", &x1);
    scanf("%i", &y1);
    scanf("%i", &x2);
    scanf("%i", &y2);
    scanf("%i", &x3);
    scanf("%i", &y3);

    if (x1 == x2){
        x4 = x3;
    }
    else if (x2 == x3){
        x4 = x1;
    }
    else {
        x4 = x2;
    }
    if (y1 == y2) {
        y4 = y3;
    }
    else if (y2 == y3){
        y4 = y1;
    }
    else {
        y4 = y2;
    }
    printf("%i %i",x4,y4);
}