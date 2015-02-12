#include <stdio.h>

int main(){
	
	struct Alumno{
		int edad;
		float promedio;
		char nombre[30];
	};

	struct Alumno puma[10];

	puma[3].edad = 30;

	printf("%d\n\n", puma[3].edad);

}







