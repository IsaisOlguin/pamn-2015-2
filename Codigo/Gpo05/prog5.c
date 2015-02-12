#include <stdio.h>
#include <stdlib.h> 

int main(){
	
	struct Alumno{
		int edad;
		char nombre[30];
		char sexo;
		char numCuenta[10];
	};

	struct Alumno fi[10];

	fi[2].edad = 22;

	printf("%d\n", fi[2].edad);

}
