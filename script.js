let estudiantes = JSON.parse(localStorage.getItem("estudiantes")) || [];

mostrarRegistros();

function registrar() {

    let nombre = document.getElementById("nombre").value;
    let documento = document.getElementById("documento").value;
    let curso = document.getElementById("curso").value;

    if(nombre === "" || documento === "" || curso === "") {

        alert("Complete todos los campos");
        return;

    }

    let estudiante = {

        nombre,
        documento,
        curso

    };

    estudiantes.push(estudiante);

    localStorage.setItem("estudiantes", JSON.stringify(estudiantes));

    mostrarRegistros();

    document.getElementById("nombre").value = "";
    document.getElementById("documento").value = "";
    document.getElementById("curso").value = "";

}

function mostrarRegistros() {

    let lista = document.getElementById("registros");

    lista.innerHTML = "";

    estudiantes.forEach(estudiante => {

        lista.innerHTML += `
            <li>
                ${estudiante.nombre} - ${estudiante.curso}
            </li>
        `;

    });

}
