const pantalla = document.getElementById("pantalla");

function ejecutar() {

    const comando = document.getElementById("comando").value;

    switch(comando) {

        case "1":

            pantalla.innerHTML += `

> Registrar estudiante

Cédula: 108541
Nombre: julain andres ariza
Carrera: admin empresa

Estudiante registrado exitosamente.

`;

            break;

        case "2":

            pantalla.innerHTML += `

> Registrar entrada

Hora entrada: 22:00

Entrada registrada correctamente.

`;

            break;

        case "3":

            pantalla.innerHTML += `

> Registrar salida

Hora salida: 11:00

Salida registrada correctamente.

`;

            break;

        case "4":

            pantalla.innerHTML += `

> Mostrar estudiante

Nombre: julain andres ariza
Carrera: admin empresa

`;

            break;

        case "5":

            pantalla.innerHTML += `

Saliendo del sistema...

`;

            break;

        default:

            pantalla.innerHTML += `

Opcion invalida

`;

    }

    document.getElementById("comando").value = "";

}
