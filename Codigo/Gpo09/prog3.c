#include <stdio.h>

int main(){

	int x = 20;
	int *p;

	p = &x;

	*p = 233;

	printf("%d\n", x);


}