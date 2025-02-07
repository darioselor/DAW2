

//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//?                         OBJETO WINDOW
//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
{

// console.log("Printea en la consola");
// console.log(window.location.href);

// let titulo = document.getElementById("títuloPágina");

// titulo.textContent = "Nuevo título página";

// let nombre = window.prompt("¿Cuál es tu nombre?"); // Sale

// let confirmar = window.confirm("Seguro?");

// if (confirmar) {
//     console.log("Menos mal que te sabes tu nombre");
// } else {
//     console.log("¿De verdad que no te sabes tu nombre?")
// }

}

//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//?                         OBJETO STRING
//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
{

// let nombre1 = "Juan";
// let saludo = `Hola, ${nombre1}`; // Hay que usar los acentos abiertos
// console.log(saludo);

// const nombre2 = new String('Federico');
// console.log(`Nombre conseguido con constructor String: ${nombre2}`);
// console.log(`El Nombre ${nombre2} tiene ${nombre2.length} letras`)

// let abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
// console.log(abecedario.charAt(9)); // Devuelve el carácter en la posición 10
// console.log(abecedario.charAt(0)); // Prueba para comprobar que la posición 0 es A

// let letra = "ñ";
// console.log(letra.charCodeAt(0)); // Imprime '165' que es el Unicode de la letra ñ

// let frase = "Esta frase contiene la palabra programación";

// // indexOff busca la primera aparición de la subcadena
// let indice = frase.toLowerCase().indexOf("programación");

// // lastIndexOf busca la última aparición de la subcadena
// let lastIndice = frase.toLowerCase().lastIndexOf("programación");
// if (indice !== -1) {
//     console.log(`"programación" está en la posición: ${indice}`);
// } else {
//     console.log(`"programación" no se encuentra en la frase`);
// }

// let textoParaRemplazar = "Hola a todos, soy un robot";

// // .replace(A, B) reemplaza la subcadena A por la subcadena B
// let textoReemplazado = textoParaRemplazar.replace("robot", "humano");
// console.log(textoReemplazado);

// // .trim() elimina los espacios al principio y al final de la cadena
// let textoTrimeable = "       Hola Mundo             ";
// console.log(textoTrimeable.trim());

// // concat(cadena2, ...)
// let nombreConcat = "Julio";
// let apellidoConcat = "Buenafuente";
// let nombreCompletoConcat = nombreConcat.concat(" ", apellidoConcat);
// console.log(nombreCompletoConcat);

// //slice(start, end) Extrae una subcadena desde la posición inicial dada y la final
// let textoSlice = "Este texto no importa. Este texto sí que importa";
// let textoSliced = textoSlice.slice(20);
// console.log(textoSliced);

// //split(separator, limit)
// let fraseSplit = "Esta frase se divide por espacios";
// let palabras = fraseSplit.split(" ");
// console.log(palabras); // Imprime un array con las palabras:
// // ["Esta", "frase", "se", "divide", "por", "espacios"]

// let lista = "rojo,verde,azul,amarillo";
// let colores = lista.split(",");
// console.log(colores); // Imprime un array con los colores:
// // ["rojo", "verde", "azul", "amarillo"]

// let cadenaLarga = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
// let partes2 = cadenaLarga.split(" ", 5); // Límite de 5 subcadenas

// let texto = "Hola, mundo!";
// let caracteres = texto.split("");
// console.log(caracteres); // Imprime un array con cada caracter

}

//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//?                         OBJETO DATE
//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
{

// // Sin argumentos crea un objeto Date con la fecha y hora actual según el reloj del sistema.
// let fechaActual = new Date();
// console.log(fechaActual);

// // Con argumentos numéricos permite crear un objeto Date con una fecha y hora específicos.
// // Orden: Año -> Mes -> Día -> Hora -> Minutos -> Segundos -> Milisegundos.
// let fechaEspecifica = new Date(2004, 0, 10, 10, 30, 15, 300);
// console.log(fechaEspecifica);

// // Con cadena de fecha permite crear un objeto Date a partir de una cadena de texto que 
// // que represente una fecha y hora en un formato específico.
// let fechaCadena = "2024-06-12T10:30:15.500+02:00";
// let fechaObjeto = new Date(fechaCadena);
// console.log(fechaObjeto);

// // El objeto Date cuenta con Getters y Setters. Aquí tienes un ejemplo de cada uno de los
// // Getters y el formato que devuelve.
// {
//     // .getFullYear() Devuelve el año de la fecha como un número entero de cuatro dígitos.
//     let actualYear = fechaActual.getFullYear();
//     console.log(`Estamos en el año ${actualYear}`);
    
//     // .getMonth() Devuelve el mes de la fecha como un número entero de 0 a 11.
//     let actualMonth = fechaActual.getMonth();
//     console.log(`Estamos en el mes ${actualMonth}`);
    
//     // .getDate() Devuelve el día del mes de la fecha como un número entero del 1 al 31.
//     let actualDay = fechaActual.getDate();
//     console.log(`Estamos a día ${actualDay}`);
    
//     // .getHours() Devuelve la hora de la fecha como un número entero del 0 al 23
//     let actualHour = fechaActual.getHours();
//     console.log(`Son las ${actualHour}`);
    
//     // .getMinutes() Devuelve los minutos de la fecha como un número entero del 0 al 59
//     let actualMinutes = fechaActual.getMinutes();
//     console.log(`con ${actualMinutes} minutos`);
    
//     // .getSeconds() Devuelve los segundos de la fecha como un número entero del 0 al 59
//     let actualSeconds = fechaActual.getSeconds();
//     console.log(`y ${actualSeconds} segundos.`);

//     // .getMilliseconds(): Devuelve los milisegundos de la fecha como un número entero 
//     // de 0 a 999.
//     let actualMilisegundos = fechaActual.getMilliseconds();
//     console.log(`Milisegundos actuales: ${actualMilisegundos}`); 

}

//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//?                     OBJETO NUMBER Y MATH
//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
{

//*      FUNCIONES OBJETO NUMBER:

//  .toString() Convierte el número en una cadena de texto
    let numberString = 1299.23;
    console.log(numberString.toString());

//  .toFixed(n) Convierte el número en una cadena de texto on 'n' decimales
    let numberFixed = 122.344232;
    console.log(numberFixed.toFixed(3));

//  .toExponential(n) Convierte un número a una cadena de texto en 
//  notación científica.
    let numberExponential = 1022.23;
    console.log(numberExponential.toExponential(3));
    
//  .valueOF() Devuelve el valor primitivo del número.
    let numberPrimitive = 123.11;
    console.log(numberPrimitive.valueOf());

//  .isFinite(number) Devuelve true/false dependiendo si el número es finito
    let numberFinite = 33;
    let numberNaN = "rodrigo";
    console.log(isFinite(numberFinite));
    console.log(isFinite(numberNaN));

// .isNaN(number) Devuelve true/false dependiendo si el número es NaN o no
    console.log(isNaN(numberNaN));
    console.log(isNaN(numberFinite));

//  .parse(String) Convierte una cadena de texto a un número.
    console.log(parseFloat(numberFixed.toFixed(2)));


//*      FUNCIONES OBJETO MATH:

//  CONSTANTES MATEMÁTICAS:
//      π (Pi): Representa el valor de pi (aproximadamente 3.14159).
//      e (Base de los logaritmos naturales): Aproximadamente 2.71828.
//      LN2 (Logaritmo natural de 2): Aproximadamente 0.693147.
//      LN10 (Logaritmo natural de 10): Aproximadamente 2.302585.
//      SQRT2 (Raíz cuadrada de 2): Aproximadamente 1.414214.
//      SQRT1_2 (Raíz cuadrada de 1/2): Aproximadamente 0.707107.
//      E (Número de Euler): Aproximadamente 2.718282.
//      Infinity (Infinito positivo): Representa el valor infinito.
//      NEGATIVE_INFINITY (Infinito negativo): Representa el valor
//      infinito negativo.
//      NaN ("Not a Number"): Representa un valor no numérico.

//  CONSTANTES DE REDONDEO:
//      ROUND_DOWN (1): Redondea hacia abajo.
//      ROUND_UP (2): Redondea hacia arriba.
//      ROUND_CEIL (3): Redondea hacia arriba (equivalente a Math.ceil()).
//      ROUND_FLOOR (4): Redondea hacia abajo (equivalente a Math.floor()).
//      ROUND_HALF_UP (5): Redondea hacia el valor más cercano, con desempate
//      hacia arriba.
//      ROUND_HALF_DOWN (6): Redondea hacia el valor más cercano,
//      con desempate hacia abajo.

//  FUNCIONES:

//  Funciones aritméticas básicas:
//      abs(x): Valor absoluto de x.
//      pow(x, y): Eleva x a la potencia y.
//      sqrt(x): Raíz cuadrada de x.
//      floor(x): Redondea x hacia abajo al entero más cercano.
//      ceil(x): Redondea x hacia arriba al entero más cercano.
//      round(x): Redondea x al entero más cercano.
//      random(): Genera un número aleatorio entre 0 y 1.

//  Funciones trigonométricas:
//      sin(x): Seno de x (en radianes).
//      cos(x): Coseno de x (en radianes).
//      tan(x): Tangente de x (en radianes).
//      asin(x): Arcoseno de x (en radianes, entre -π/2 y π/2).
//      acos(x): Arcocoseno de x (en radianes, entre 0 y π).
//      atan(x): Arcotangente de x (en radianes, entre -π/2 y π/2).
//      atan2(y, x): Arcotangente de y/x (en radianes, entre -π y π).

//  Funciones de logaritmos:
//      log(x): Logaritmo en base 10 de x.
//      log10(x): Logaritmo en base 10 de x.
//      log2(x): Logaritmo en base 2 de x.
//      exp(x): Exponencial de x (e^x).

//  Funciones de redondeo:
//      round(x): Redondea x al entero más cercano.
//      floor(x): Redondea x hacia abajo al entero más cercano.
//      ceil(x): Redondea x hacia arriba al entero más cercano.

//  Otras funciones:
//      max(x, y, ...): Devuelve el valor máximo entre los argumentos.
//      min(x, y, ...): Devuelve el valor mínimo entre los argumentos.

}

//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//?                     ALMACENAMIENTO LOCAL
//? xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

{
// //?                           COOKIES
// //? ................................................................

    
// // Creación de cookies:
//     document.cookie = "nombre=Pepe"; 
//     document.cookie = "edad=30"; 
//     document.cookie = "ciudad=Valencia";

//     alert("Cookies guardadas correctamente.");
//     console.log(document.cookie);

// // path: Establece la accesibilidad de la cookie.
//     document.cookie = "ciudad2=Murcia; path=/"

// // expires, max-age: Establece cuando expira la cookie.
// // Si estos valores están predeterminados, la cookie expira junto a la sesión.
//     let date = new Date(Date.now() + 864e2);
//     date = date.toUTCString();
//     document.cookie = "ciudad3=Cartagena;" + date;

//     document.cookie = "ciudad4=Logroño; max-age=3600"
//     alert();
    

// //?                    API ALMACENAMIENTO WEB
// //? ................................................................

// // LocalStorage es una api web que permite almacenar datos en el navegador 
// // del usuario de forma persistente.

// // Los elementos mas importantes del almacenamiento local son:

// // .setItem(key,value) Almacena un dato en el almacenamiento local.
// localStorage.setItem("nombre", "Juan");
// localStorage.setItem("edad", 30);

// // .getItem(key) Devuelve el dato almacenado con la clave dada.
// let nombre = localStorage.getItem("nombre");
// console.log(nombre);

// let edad = localStorage.getItem("edad");
// console.log(edad);

// // .removeItem(key) Elimina el dato almacenado con la clave dada.
// localStorage.removeItem("nombre");
// console.log(localStorage.getItem("nombre"));

// // .clear() Elimina todos los datos almacenados en local.
// localStorage.clear();
// console.log(localStorage.getItem("edad"));

}