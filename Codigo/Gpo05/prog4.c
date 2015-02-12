#include <stdio.h>
#include <stdlib.h> 

int main(){
	
	struct Alumno{
		int edad;
		char nombre[30];
		char sexo;
		char numCuenta[10];
	};

	struct Alumno fi;

	fi.edad = 22;

	printf("%d\n", fi.edad);

}
