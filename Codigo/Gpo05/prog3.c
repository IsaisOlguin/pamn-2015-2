#include <stdio.h>
#include <stdlib.h> 

int main(){
	
	int *p;
	int *q;

	p = (int *)malloc(sizeof(int));
	q = (int *)malloc(sizeof(int));

	*p = 20;

	printf("%p -> %d \n", p, *p);
	printf("%p \n", q);

}
