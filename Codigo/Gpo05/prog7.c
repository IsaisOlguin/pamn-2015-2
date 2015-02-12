#include <stdio.h>

int main(){
	
	int n = 1;

	void *p;

	p = &n;

	*((int *)p) = 34;

	printf("%d\n\n", n);


	return 0;
}