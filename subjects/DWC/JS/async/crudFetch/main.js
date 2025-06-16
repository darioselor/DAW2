const URL = "http://localhost:3000"
const ArticulosEndpoint = "/articulos"

window.onload = () => {
    // DOM
    const divArticulos = document.getElementById("divArticulos")
    
    const btnNuevo = document.getElementById("btnNuevo")
    btnNuevo.onclick = () => nuevoArticulo()
    
    const dialogNuevo = document.getElementById("dialogNuevo")
    const dialogModificar = document.getElementById("dialogModificar")

    
    // FUNCIONES
    verArticulos()
    
}

function verArticulos(){
    
    divArticulos = document.getElementById("divArticulos")
    divArticulos.innerHTML = ""
    fetch(URL + ArticulosEndpoint)
    .then(response => {
        if (!response.ok) {
            throw new Error("Articles not found");   
        }
        return response.json()
    })
    .then(articulos => {        
        articulos.forEach(a => {
            createCard(a)
        });    
    })
    .catch(error => {
        console.log(error)
    })
    
}


function modificarArticulo(articulo){
    
    // Crear el dialog con el formulario y las opciones default 
    // con los valores del articulo.
    // Coger los valores nuevos y pasarselos al fetch
    console.log("Modificando " + articulo.nombre);
    
    
    
    verArticulos();
}
function borrarArticulo(id) {
    
    fetch(URL + ArticulosEndpoint + `/${id}`, {method:'DELETE'})
    .then(response => {
        if (!response.ok) {
            throw new Error("Error eliminando el articulo con id: " + id);
        }
        console.log("Artículo borrado con éxito");
    })
    verArticulos()
}
function nuevoArticulo() {
    
    let botonGrabar = document.getElementById("btnGrabarNuevo")
    let botonCancelar = document.getElementById("btnCancelarNuevo")
    
    botonGrabar.onclick = () => {
        event.preventDefault()
        formId = document.forms["formNuevo"]["id"]
        formId.ariaRequired
        formName = document.forms["formNuevo"]["nombre"]
        formName.ariaRequired
        formPrice =  document.forms["formNuevo"]["precio"]
        formPrice.ariaRequired
        
        console.log("Llega hasta aquí")
        
        let id = formId.value
        let name = formName.value
        let price = formPrice.value
        
        console.log({
            id,
            name,
            price
        });
        
    }
    
    dialogNuevo.show();
    
    verArticulos();
}

function createCard(articulo){

    let content = "";

    let divCard = document.createElement("div")
    divCard.id=articulo.id;
    divCard.className = "card"
    
    let cardBodySpan = document.createElement("span")
    cardBodySpan.className="card-body"
    
    let name = document.createElement("h4")
    name.className="card-title"
    content = articulo.nombre
    name.innerHTML = content

    let price = document.createElement("h3")
    price.className="card-text"
    content = articulo.precio
    price.innerHTML += content
    price.innerHTML += "€"

    let modifyButtonSpan = document.createElement("span")
    let modifyButton = document.createElement("button")
    modifyButton.innerHTML = "Modificar"
    modifyButton.className = "btn btn-primary"
    modifyButton.id = articulo.id
    modifyButton.onclick = () => modificarArticulo(articulo)

    let deleteButtonSpan = document.createElement("span")
    let deleteButton = document.createElement("button")
    deleteButton.innerHTML = "Eliminar"
    deleteButton.className = "btn btn-danger"
    deleteButton.id = articulo.id
    deleteButton.onclick = () => borrarArticulo(articulo.id)

    cardBodySpan.appendChild(name)
    cardBodySpan.appendChild(price)
    
    modifyButtonSpan.appendChild(modifyButton)
    deleteButtonSpan.appendChild(deleteButton)

    divCard.appendChild(cardBodySpan)
    divCard.appendChild(modifyButtonSpan)
    divCard.appendChild(deleteButtonSpan)

    divArticulos.appendChild(divCard);

}

