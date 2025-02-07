//?                      CREACIÓN DE OBJETOS
//?  ................................................................
//* Literal de objeto:
const persona = {
    nombre: "Pablo",
    apellido: "Picasso",
    edad: "Demasiada",
    ciudad: "Cementerio"
};

//* Constructor de objetos:
const personaObject = new Object();
personaObject.nombre = "María";
personaObject.apellido = "Martínez";
personaObject.edad = 25;
personaObject.ciudad = "Valencia";

//?               ACCESO A PROPIEDADES DE UN OBJETO
//?  ................................................................

//* Notación con punto
const nombrePersona = persona.nombre;

//* Notación en corchetes:
const propiedad = "edad";
const edadPersona = persona[propiedad];

alert(persona.padre); // Devuelve undefined
alert("padre" in persona); // Ambas funcionan para saber si la propiedad existe
// pero la diferencia es que si la propiedad tiene como valor "undefined" no
// se puede saber utilizando el primer método.

console.log(persona.cp);
persona.cp = 46920;
console.log(persona.cp);

// El bucle "for... in"
for (const key in persona) {
    console.log(`${key}: ${persona[key]}`);
}

// La comparación de objetos no dará igual si una propiedad se encuentra desordenada.
const persona1 = {
    nombre: "Juan",
    apellido: "Pérez",
    edad: 30,
    ciudad: "Valencia"
    };
const persona2 = {
    ciudad: "Valencia",
    nombre: "Juan",
    apellido: "Pérez",
    edad: 30
    };
console.log(persona1==persona2)


//?                     MÉTODOS DE LOS OBJETOS
//?  ................................................................

const personaMethodic = {
    nombre: "Juan",
    apellido: "Pérez",
    ciudad: "Valencia",
    edad: 30,
    
    // Método "obtenerNombreCompleto"
    obtenerNombreCompleto: function() {
        return this.nombre + " " + this.apellido;
    }
};

const nombreCompleto = personaMethodic.obtenerNombreCompleto();

function hola() {
    alert(this)
}
hola();


//?                    JSON (JS Object Notation)
//?  ................................................................

let estudiante={
    "nombre": "Juan Pérez",
    "edad": 30,
    "hobbies":["leer","cine","deportes"],
    "mascota":{
        "tipo": "perro",
        "nombre" : "Tommy"
    }
}
estudiante.hobbies.forEach(h=>console.log(h));
console.log(Object.keys(estudiante.mascota));

// Ejemplo array de objetos:
let estudiantes = [
    {
        nombre: "Juan Pérez",
        edad: 30,
        ciudad: "Madrid",
        hobbies: ["leer", "cine", "deportes"],
        mascota: {
            tipo: "perro",
            nombre: "Toby"
        }
    },
    {
        nombre: "Ana López",
        edad: 25,
        ciudad: "Barcelona",
        hobbies: ["bailar", "música", "viajar"],
        mascota: {
            tipo: "gato",
            nombre: "Misha"
        }
    },
    {
        nombre: "Carlos García",
        edad: 40,
        ciudad: "Valencia",
        hobbies: ["fotografía", "senderismo", "cocina"],
        mascota: {
            tipo: "pez",
            nombre: "Nemo"
        }
    }
];

//* Métodos JSON:

// JSON.stringify(object) convierte un objeto en un JSON (cadena de texto con
// la sintaxis JSON)

// JSON.parse(cadenaTexto) codifica una cadena de texto en sintaxis JSON y la
// convierte en un objeto.
