#include <stdio.h>
#include <stdlib.h> 

int main(){
	
	struct Alumno{
		int edad;
		char nombre[30];
		char sexo;
		char numCuenta[10];
		struct Alumno *sig;
	};

	struct Alumno *fi, *lista;

	lista=(struct Alumno *)malloc(sizeof(struct Alumno));
	lista->sig = NULL;

	for(i=0;i<7000000;i++){
		fi=(struct Alumno *)malloc(sizeof(struct Alumno));
		fi->edad = 22;
		printf("%d\n", fi->edad);

		fi->sig = lista->sig;
		lista->sig = fi;

	}
}