#include <stdio.h>

int main(){
	
	int x[5]={1, 2, 3, 4, 5};
	int *p;

	p = x;

	printf("%d\n", *p);

	p = &x[2];

	(p++);
	(p++);
	(p++);
	(p++);
	(p++);
	printf("%d\n", p);


}