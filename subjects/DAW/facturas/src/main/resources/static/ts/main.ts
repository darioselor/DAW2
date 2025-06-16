// ejemplo.ts
// 1. Tipado explícito
function saludar(nombre: string): string {
  return `¡Hola, ${nombre}!`;
}

// 2. Interfaces y genéricos
interface Producto {
  id: number;
  nombre: string;
  precio: number;
}

function listar<T>(items: T[]): void {
  items.forEach((item) => console.log(item));
}

// 3. Clases y propiedades de solo lectura
class Carrito {
  private items: Producto[] = [];
  readonly creadoEn: Date = new Date();

  agregar(producto: Producto): void {
    this.items.push(producto);
  }

  total(): number {
    return this.items.reduce((suma, p) => suma + p.precio, 0);
  }
}

// ---------------------
// Código de prueba
const productos: Producto[] = [
  { id: 1, nombre: "Teclado", precio: 25 },
  { id: 2, nombre: "Ratón",   precio: 15 },
];

listar(productos);        // Muestra la lista en consola

const carrito = new Carrito();
productos.forEach((p) => carrito.agregar(p));

console.log(`Total: €${carrito.total()}`);  // Total: €40
console.log(saludar("Mundo"));              // ¡Hola, Mundo!
