#include <stdio.h>

int main(){

	int a[5] = {1, 2, 3, 4, 5};

	int *p;

	p = &a[2];
	p++;
	p++;
	p++;
	p++;
	p++;
	p++;
	printf("%d\n", *p);
}