#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;

	// Asignamos memoria dinámica al apuntador
	p = (int *)malloc(sizeof(int));

	printf("%p\n", &p);
	printf("%p\n", p);
	printf("%d\n", *p);



}

