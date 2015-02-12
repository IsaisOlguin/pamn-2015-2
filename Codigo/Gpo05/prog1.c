#include <stdio.h>

int main(){
	
	int x[10]={1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	int *p;

	p = x;

	printf("%p\n ", p);
	printf("%p\n ", x);
	printf("%d\n ", p[2]);
	printf("%p\n ", &x[0]);

	return 0;
}