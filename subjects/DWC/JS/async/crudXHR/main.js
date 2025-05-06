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
    
    // URL base de datos JSON
    
    // DOM ELEMENTS
}


function verArticulos(){
    let divContainer = document.getElementById("container");
    const URL = "empresa.json";
    
    let xhr = new XMLHttpRequest();
    xhr.open("get", URL)
    xhr.responseType='json'
    xhr.send()
    let content;
    xhr.onload = ()=>{        
        content = "";
        xhr.response.articulos.forEach(articulo => {
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
        divContainer.innerHTML = content;
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