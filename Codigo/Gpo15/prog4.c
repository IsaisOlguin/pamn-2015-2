#include <stdio.h>

void intercambia(int *a, int *b);

int main(){

	int x = 20;
	int y = 15;

	printf("%d - %d\n", x, y);

	intercambia(&x, &y);

	printf("%d - %d\n", x, y);

}

void intercambia(int *a, int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}
