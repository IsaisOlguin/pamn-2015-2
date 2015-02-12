#include <stdio.h>

int main(){

	int x = 22;
	int *p;

	p = &x;

	*p = 3;

	printf("%d\n", x);
}