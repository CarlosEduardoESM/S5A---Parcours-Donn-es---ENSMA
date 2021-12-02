#include <stdio.h>
#include <math.h>

int main (int argc, char *argv[]) {

    double a, b, c, x1, x2;
    double delta;
    printf("Poly2: A * x^2 + B * x + C = 0\n");
    printf("Entree le valeur de A: ");
    scanf("%lf",&a);
    printf("Entree le valeur de B: ");
    scanf("%lf",&b);
    printf("Entree le valeur de C: ");
    scanf("%lf",&c);
    delta = b * b - 4 * a * c;
    printf("%f %f %f",a,b,c);
    x1 = (- b + sqrt(delta)) / (2 * a);
    x2 = (- b - sqrt(delta)) / (2 * a);
    printf("La racine X1 est: %f\n",x1);
    printf("La racine X2 est: %f\n",x2);

    return 0;
}