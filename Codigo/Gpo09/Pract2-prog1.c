#include <stdio.h>

int main(){
	
	struct Alumno{
		int edad;
		float promedio;
		char nombre[30];
	};

	struct Alumno puma;

	puma.edad = 30;

	printf("%d\n\n", puma.edad);



}









