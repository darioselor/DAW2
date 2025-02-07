// Estructura básica de una función:

// function nombreFunction(parameter1,parameter2) {

//     return value;
// }


//? TIPOS DE FUNCIONES:

// Funciones declaradas:
function declaredFunction(params) {
    params++;
    let value = params;
    return value;
}

console.log(declaredFunction(1));

// Funciones de expresión:
const sumar = function(a,b) {
    return a + b;
}

console.log(sumar(5,3));

// Funciones anónimas:
(function() { 
    console.log("Esta función se ejecuta inmediatamente")
})();

//? PARÁMETROS:

// Pasar el mismo número de parámetros a la funcion que el número
// definido en la cabecera sería la forma tradicional de los demás
// lenguajes.

// Se puede también utilizar valores predeterminados para los parámetros
// de la siguiente forma:
function muestraMensaje(msg = "No has pasado ningún mensaje como parámetro") {
    alert(msg);
}

muestraMensaje("Aquí has pasado este mensaje como parámtro");
muestraMensaje();

// Utilizar el objeto arguments nos permite utilizar un array de indefinidos
// parámetros en nuestra función.
function sumarFunction() {
    let total = 0;
    for (let i = 0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;
}

let resultado = sumarFunction(2,3,5,6,7,1,12,45,6,6,4,3);
console.log(resultado);

// Los parámetros Rest y Operador Spread permiten aceptar un numero indefinido
// de argumentos. Pero estos argumentos se convierten en un array a diferencia
// de el objeto arguments.

// Parámetro Rest te permite (mediante ... delante del parámetro) pasarle un
// array de tamaño indefinido como parámetro.
function sumarRest(...numeros) {
    let total = 0;
    numeros.forEach(function(numero){
        total += numero;
    });
    return total;
}
console.log(sumarRest(1,2,3,4,5,6,7,8,9,10));

// Operador Spread te permite (también usando ... delante del iterable)
// convertirlo en los elementos individuales.
const numerosSpread = [1,2,3,4,5,6,7,19,234,4333];
console.log(sumarRest(...numerosSpread));

//? SINTAXIS FATARROW
const sumarFatArrow = (a,b) => a + b;
const resultadoFatArrow = sumarFatArrow(3,5);
console.log(resultadoFatArrow);


