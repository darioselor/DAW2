//?                      CREACIÓN DE CLASES
//?  ................................................................

class Persona {
    constructor(nombre, apellido, edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    obtenerNombreCompleto(){
        return `${this.nombre} ${this.apellido}`;
    }
    
    calcularEdadSiguiente(){
        return this.edad + 1;
    }

    saludar(){
        console.log(`Hola, mi nombre es ${this.nombre} ${this.apellido}`);
    }
}

//?                      GETTERS Y SETTERS
//?  ................................................................

//* Propiedades privadas:

class PersonaPrivada {
    _nombre; // _propiedad crea una propiedad privada
    #ciudad; // #propiedad crea una propiedad privada
    
    constructor(nombre, ciudad) {
        this._nombre=nombre;
        this.#ciudad=ciudad;
        
    }
    get nombre(){
        return this._nombre;
    }
    
    set nombre(nombre){
        this._nombre = nombre;
    }
}

unaPersonaPrivada = new PersonaPrivada('Juan', 'Valencia');
console.log(unaPersonaPrivada.nombre);
unaPersonaPrivada.nombre = 'Pepe';
console.log(unaPersonaPrivada.nombre);

console.log(unaPersonaPrivada.ciudad); // Devuelve undefined por no tener getter
unaPersonaPrivada.ciudad = 'Madrid'; // Genera un error por no tener setter


//?                          POLIMORFISMO
//?  ................................................................

class Estudiante extends Persona {
    constructor(nombre, apellido, curso) {
        super(nombre,apellido);
        this.curso = curso;
    }

    presentarse() {
        super.saludar();
        console.log(`Soy estudiante del curso ${this.curso}`);
    }

    saludar(){
        console.log(`Me presento como hijo ${this.nombre}`);
        
    }
}

Persona.info();
const estudiante1 = new Estudiante("Juan", "Pérez", "Matemáticas");
estudiante1.presentarse();
estudiante1.saludar();