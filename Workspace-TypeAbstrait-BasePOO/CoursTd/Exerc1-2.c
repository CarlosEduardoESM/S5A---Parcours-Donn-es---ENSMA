#include <stdio.h>
#include <math.h>

int main (int argc, char *argv[]) {
    int cote;
    double diagonale;
    printf("Entree la diagonale du carre: ");
    scanf("%d",&cote);
    diagonale = cote * sqrt(2);
    printf("La diagonale du carre de cote %d est %f\n",cote,diagonale);
    return 0;
}