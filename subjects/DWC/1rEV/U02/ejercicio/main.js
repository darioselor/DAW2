import { articulos } from "./articulos.js"
import { verMensaje } from "./utilidades.js"
import { } from "./typeofExample.js";
// Comentario de Ejemplo

window.onload = function () {
    verMensaje()
    alert("Total artículos: " + articulos.length)
    document.getElementById("btn").addEventListener("click", verMensaje)
}