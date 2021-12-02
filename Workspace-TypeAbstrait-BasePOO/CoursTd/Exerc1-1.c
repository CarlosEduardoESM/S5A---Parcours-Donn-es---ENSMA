#include <stdio.h>

int main (int argc, char *argv[]) {
    int entier, carre;
    printf("Entree un entier: ");
    scanf("%d",&entier);
    carre = entier * entier;
    printf("Le carre de %d est %d\n",entier,carre);
    return 0;
}