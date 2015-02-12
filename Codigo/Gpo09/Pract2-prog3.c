#include <stdio.h>
#include <stdlib.h>

int main(){
	
	struct Alumno{
		int edad;
		float promedio;
		char nombre[30];
	};

	struct Alumno *puma;
	puma = (struct Alumno *)malloc(sizeof(struct Alumno));

	puma->edad = 30;

	printf("%d\n\n", puma->edad);

}







