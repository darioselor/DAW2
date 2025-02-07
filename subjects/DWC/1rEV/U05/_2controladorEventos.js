//?                   CONTROLADORES DE EVENTOS
//?  ................................................................

//* Atributo HTML
// Se puede establecer un controlador en HTML con un atributo denominado
// on<event>.
// <button class="btn btn-primary" onclick="alert('Hola...')">Saludar</button>

//* Propiedad DOM
// En este caso será a través del DOM, Modelo de Objetos de Documento, la
// manera en la que asignaremos el controlador del evento a nuestro elemento.
// Para ello deberemos seleccionar el elemento al que queremos asignar el
// controlador y asignarle el controlador utilizando la propiedad DOM on<event>.

let miBoton=document.getElementById("miBoton");
miBoton.onclick=saludar();

function saludar() {
    alert("Hola...")
}

// La manera correcta de escribir esto sería sin los paréntesis ya que de esta
// forma asignamos el codigo de la función saludar a la función onclick y no
// su ejecución.

miBoton.onclick=saludar;

//* Listeners de eventos
function handler1() {
    alert( 'Hola primera vez...' );
    }
    function handler2() {
    alert( 'Hola segunda vez...' );
    }
let miBoton4=document.getElementById("miBoton4")
miBoton4.addEventListener("click", handler1);
miBoton4.addEventListener("click", handler2);
miBoton4.removeEventListener("click",handler1);
miBoton4.removeEventListener("click",handler2);
    