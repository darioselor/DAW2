window.onload=()=>{

    // Botones
    const botonVerArticulos = document.getElementById("verArticulos");
    botonVerArticulos.addEventListener("click", verArticulos);

    const botonVerArticulo = document.getElementById("verArticulo");
    botonVerArticulo.addEventListener("click", verArticulo);

    const botonNuevoArticulo = document.getElementById("nuevoArticulo");
    botonNuevoArticulo.addEventListener("click",nuevoArticulo);

    const botonModificarArticulo = document.getElementById("modificarArticulo");
    botonModificarArticulo.addEventListener("click", modificarArticulo);

    const botonBorrarArticulo = document.getElementById("borrarArticulo");
    botonBorrarArticulo.addEventListener("click", borrarArticulo);
    
    // Container
    const divContainer = document.getElementById("container");
    
    // URL base de datos JSON
    const URL = "https://github.com/darioselor/DAW2/blob/develop/subjects/DWC/js/async/crudXHR/empresa.json";
}

function verArticulos(){
    
    let xhr = new XMLHttpRequest();
    xhr.open("GET", URL)
    xhr.responseType='json'
    xhr.send()
    xhr.onload = function () {
        let content;
        xhr.response.articulo.forEach(articulo => {
            content += `
            <div>
                <span>
                    <h3>
                        ${articulo.id}
                    </h3>
                </span>
                <span>
                    <h4>
                        ${articulo.nombre}  
                    </h4>
                </span>
                <div>
                    <h2>
                        ${articulo.precio}
                    </h2>
                </div>
            </div>  
            `;
        });
        divContainer.innerHTML=content;
    }
}

function verArticulo(){
    const id = prompt("¿Cuál es el ID del artículo que deseas consultar?");

}

function nuevoArticulo(){
}

function modificarArticulo(){
}

function borrarArticulo(){
}