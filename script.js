const pantalla = document.getElementById("pantalla");

let estudiantes = [];

function ejecutar() {

    const comando = document.getElementById("comando").value;

    if(comando === "1") {

        const nombre = prompt("Ingrese nombre:");
        const cedula = prompt("Ingrese cédula:");
        const carrera = prompt("Ingrese carrera:");

        const estudiante = {

            nombre,
            cedula,
            carrera

        };

        estudiantes.push(estudiante);

        pantalla.innerHTML += `

> Registrar estudiante

Cédula: ${cedula}
Nombre: ${nombre}
Carrera: ${carrera}

Estudiante registrado exitosamente.

`;

    }

    else if(comando === "2") {

        pantalla.innerHTML += `

> Registrar entrada

Hora entrada registrada correctamente.

`;

    }

    else if(comando === "3") {

        pantalla.innerHTML += `

> Registrar salida

Hora salida registrada correctamente.

`;

    }

    else if(comando === "4") {

        pantalla.innerHTML += `

===== ESTUDIANTES =====

`;

        estudiantes.forEach(estudiante => {

            pantalla.innerHTML += `
Nombre: ${estudiante.nombre}
Cédula: ${estudiante.cedula}
Carrera: ${estudiante.carrera}

`;

        });

    }

    else if(comando === "5") {

        pantalla.innerHTML += `

Saliendo del sistema...

`;

    }

    else {

        pantalla.innerHTML += `

Opcion invalida

`;

    }

    document.getElementById("comando").value = "";

}
