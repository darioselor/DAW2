//?                            ARRAYS
//?  ................................................................

//* Literal de array:
const arrayLiteral = ["manzana", "pera", "uva"];
const arrayLiteralMixto = ["manzana", 12, true, {key: "value"}];

//* Constructor de array
const arrayCtor = new Array("manzana", "pera", "uva");
const arrayCtorMixto = new Array("pera", 33, true, {key: "value"})
console.log(arrayCtorMixto);
console.log(arrayLiteralMixto);

//* Propiedades y métodos de arrays

// .push(elemento) Agrega un nuevo elemento al final del array.
arrayCtor.push("bombón");


// .pop() Elimina el último elemento del array y lo devuelve.
console.log(arrayCtor.pop());
console.log(...arrayCtor);

// .shift() Elimina el primer elemento del array y lo devuelve.
console.log(arrayCtor.shift());
console.log(...arrayCtor);

// .unshift(elemento) Agrega un nuevo elemento al principio del array.
arrayCtor.unshift("mango");

// .splice(beginIndex, countDelete, element0, element1...)
// Elimina elementos del array y agrega nuecos elementos.
arrayLiteralMixto.splice(1, 2, 44, false);
console.log(arrayLiteralMixto);

// ..................................................................

//* Funciones de callback

// Forma tradicional:
let lista = [1, 2, 3, 4, 5];
for (let i = 0; i < lista.length; i++) {
    console.log(lista[i]);    
}

// Usando callback:
lista.forEach(function(e) {console.log(e);})// Opción FatArrow
lista.forEach(e => console.log(e)); // Opción FatArrow


//* El tipo array
alert(Array.isArray({}));
alert(Array.isArray([]));

let nodeChilds = document.getElementById("contenedor").childNodes;
console.log(nodeChilds);
nodeChilds.forEach(n => console.log(n));

let querySelectedElements = 
document.getElementById("contenedor")
        .querySelectorAll("div");

querySelectedElements.forEach(q => console.log(q));


//?                            SETS
//?  ................................................................

// El objeto Set es una estructura de datos que representa valores únicos
// y que mantienen el orden de inserción.

// Creación del Set:
const frutas = new Set(["uva", "pera", "pera", "uva"]);
console.log(frutas);

//* Métodos del Set:
// .add(value) Agrega un valor al set.
frutas.add("bombón", "uva");
console.log(frutas);

// .has(value) Devuelve true si el Set contiene el valor.
console.log(frutas.has("bombón"));

// .size Devuelve la cantidad de elementos del Set.
console.log("El Set Frutas contiene ", frutas.size, " frutas.");

// .values() Devuelve un iterador que permite recorrer los valores del Set.
frutas.values();

// .clear() Elimina todos los elementos del Set.
frutas.clear();

// .forEach(callback)
frutas.forEach(f => console.log(f));


//?                            MAPS
//?  ................................................................

// Creación de un mapa:
const clientes = new Map([
    [1, {nombre: "Juan", ciudad: "Madrid", edad: 30}],
    [2, {nombre: "Ana", ciudad: "Valencia", edad: 25}]
]);
clientes.set(3, {nombre: "Carlos", ciudad: "Barcelona", edad: 40});

//* Métodos de mapas:
// .has(clave) Devuelve true si la clave existe en el mapa.
// .get(clave) Devuelve el valor asociado a la clave.
// .set(clave, valor) Se agrega/actualiza el par clav-valor en el mapa.
// .delete(clave) Elimina el par clave-valor asociado a la clave.
// .keys() Devuelve un iterador que permite recorrer las claves.
// .values() Devuelve un iterador que permite recorrer los valores.
// .entries() Devuele un iterador que permite recorrer los pares clave-valor.
// .forEach(callback)



