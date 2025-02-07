/********** DOM ELEMENTS **********/
let matricula;
let btnAbreDatosPersonales;
let selectListaProfes;
let contenedorModulos;
let capamatricula;
let btnEfectuarMatricula;
let dialog;
let dni;
let nombre;
let btnCierraDatosPersonales;



window.onload = () => {
    matricula = new claseMatricula();

    btnAbreDatosPersonales = document.getElementById('btnAbreDatosPersonales');
    contenedorModulos = document.getElementById("contenedor");
    capamatricula = document.getElementById("capaMatricula");
    btnEfectuarMatricula = document.getElementById('btnEfectuarMatricula');
    dialog = document.getElementById('dialogDatos');
    dni = document.getElementById('dni');
    nombre = document.getElementById('nombre');
    btnCierraDatosPersonales = document.getElementById('btnCierraDatosPersonales');

    btnAbreDatosPersonales.addEventListener('click', verDatosPersonales);
    btnEfectuarMatricula.addEventListener('click', efectuarMatricula);
    btnCierraDatosPersonales.addEventListener('click', modificarDatosPersonales);

    pintarModulos("Todos");
    modificarDatosPersonales();
};





const crearModulo = (m) => {
    return `<div class="col">
                <div class="card">
                    <img src="assets/${m.nombre.toLowerCase()}.png" class="card-img-top"/>
                    <div class="card-body">
                        <h5 class="card-title">${m.nombre}</h5>
                    </div>
                    <button id=${m.codigo} class="btn-success matricular">Matricular</button>
                </div>
            </div>`
}

const pintarModulos = (profesor) => {
    let modulosFiltrados;
    let contenido = "";

    if (profesor === "Todos") {
        modulosFiltrados = modulos;
    } else {
        modulosFiltrados = modulos.filter(m => m.profesor === profesor);
    }

    modulosFiltrados.forEach((m) => {
        contenido += crearModulo(m);
    })
    contenedorModulos.innerHTML = contenido;

    const buttons = document.querySelectorAll('.matricular');
    buttons.forEach((button) => {
        button.addEventListener('click', (event) => {
            const module = modulos.find(m => m.codigo == event.target.id);
            agregarModulo(module);
        })
    })
};

const agregarModulo = (modulo) => {
    matricula.addModule(modulo);
    pintarModulosSeleccionados();
}

const pintarModulosSeleccionados = () => {
    let contenido = "";
    matricula.modules.forEach((m) => {
        contenido += crearModulo(m);
    })
    capamatricula.innerHTML = contenido;

    const buttons = capamatricula.querySelectorAll('.matricular');
    buttons.forEach(b => b.remove());
}

const verDatosPersonales = () => {
    dialog.showModal();
}

const modificarDatosPersonales = () => {
    matricula.dni = dni.value;
    matricula.name = nombre.value;
    dialog.close()
}

const efectuarMatricula = () => {
    if (matricula.dni && matricula.name && matricula.modules.length > 0) {
        console.log(JSON.stringify(matricula));
        matricula.dni = null;
        matricula.name = null;
        matricula.modules = [];
    }
}