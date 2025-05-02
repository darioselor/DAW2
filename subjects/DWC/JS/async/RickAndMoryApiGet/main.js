window.onload=()=>{
    verPersonajes();

    let container = document.getElementById("container");

    // Parámetro para anyadePersonaje(personaje)
    let personaje = {
        id: 1500,
        name: "dario",
        species: "humano"
    }
}

function verPersonajes() {
    let tablaPersonajes = document.createElement("div");
    let URL = "https://rickandmortyapi.com/api/character"

    //* Hecho con XMLHttpRequest
    let xhr = new XMLHttpRequest();
    xhr.open("get",URL);
    xhr.responseType = `json`;
    xhr.send();
    xhr.onload = ()=>{
        console.log(xhr.response);

        let content = `
        <table>
            <tr>
                <td></td><td>ID</td><td>Nombre</td><td>Especie</td>
            </tr>
        `;
        xhr.response.results.forEach(r => {
            content += `
            <tr>
                <td><img src="${URL}/avatar/${r.id}.jpeg" height= 100px></td>
                <td><h3>${r.id}</h3></td>
                <td><h2>${r.name}</h2></td>
                <td><h4>${r.species}</h4></td>
            </tr>
            `;
        });
        content += "</table>";
        
        tablaPersonajes.innerHTML=content;
    };

    
    //* Hecho con promesas y fetch
    fetch(URL, {})
    .then(response => {
        if (!response.OK) {
            throw new Error(`Mi Error ${responese.status} ${response.statusText}`);
        }    
        return response.json()
    })
    .then(respuesta => {
        console.log(respuesta);
        
        let content = `
        <table>
        <tr>
        <td></td><td>ID</td><td>Nombre</td><td>Especie</td>
        </tr>
        `;
        respuesta.results.forEach(r => {
            content += `
            <tr>
            <td><img src="${URL}/avatar/${r.id}.jpeg" height= 100px></td>
            <td><h3>${r.id}</h3></td>
            <td><h2>${r.name}</h2></td>
            <td><h4>${r.species}</h4></td>
            </tr>
            `;
        });
        content += "</table>";
        
        tablaPersonajes.innerHTML=content;
        
        
        
    }).catch(error => console.log("Network error"));
    this.container.appendChild(tablaPersonajes);
    
    
}

function borrarPersonaje(id) {
    let URL = `http://localhost:3000/articulos/${id}`;

    fetch(URL, {method: `DELETE`})
    .then(response => {
        if (!response.ok) {
            throw new Error(`Error ${response.statusText} intentando borrar personaje con ID: ${id}`);
        }
        return response.json();
    })
    .catch(error => console.error(error));
    
}

function anyadePersonaje(personaje) {
    let URL = `http://localhost:3000/articulos/${personaje.id}`;
    let nuevoPersonaje = JSON.stringify(personaje);
    let opionesFetch = {
        method: `POST`,
        headers: {"Content-Type": `application/json`},
        body: nuevoPersonaje
    }

    fetch(URL,opcionesFetch)
    .then(response => {
        if (!response.ok) {
            throw new Error(`Mi Error ${response.status} ${response.statusText}`);
        }
        return response.json();
    })
    .then(personajeAnyadido => console.log(personajeAnyadido))
    .catch(error => console.log(error));

}

// Para actualizar (PUT) le pasaremos el personaje
// con los parámetros que deseamos modificar ya
// cambiados.