#include <stdio.h>

int main()
{
	
	int col=2, ren=3;
	int total = col*ren * 3;

	int *p;

	p = (int *)malloc(total * sizeof(int));

	for( i = 0; i< ren; i++){
		for(j = 0; j<col ; j++){
			*p = 4;
			p++;
		}
	}

	return 0;
}
