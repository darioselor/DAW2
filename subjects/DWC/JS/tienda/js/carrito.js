class Carrito{

	id;
	articulosCarrito;

	constructor(id){	
		this.id = id;
        this.articulosCarrito = [];
	}

	anyadeArticulo(articulo){
		if (this.articulosCarrito.includes(articulo)) {
			this.modificaUnidades(articulo.codigo, 1);
		} else {
			let cantidad = 1;
			let total = articulo.precio * cantidad;
			this.articulosCarrito.push({articulo, cantidad, total});
			console.log(this.articulosCarrito);
			
		}
		this.verCarrito();
	}
	
	modificaUnidades(codigo,n){	
		let articulo = this.articulosCarrito.find(a => a.codigo = codigo);
		console.log("aquí también llega");
		if (this.articulosCarrito.find(a => a.codigo=codigo)) {
			if (n=1) {
				a.cantidad =+ 1;
			}
			a.cantidad =- 1;
			if (a.cantidad < 1){
				this.borraArticulo(a.codigo);
			}
		}
	}	
	verCarrito(){
		console.log("Ha llegado hasta aquí!!");
		
		let content=`
		<table>
		<tr>
		<td></td>
		<td>nombre</td>
		<td>descripcion</td>
		<td>precio</td>
		<td>unidades</td>
		<td>total</td>
		<td></td>
		</tr>
		`;
		
		// Me llega al artículo únicamente el id
		this.articulosCarrito.forEach(a => {
			content += `
			<tr>
			<td><img src= "assets/${a.articulo.codigo}.jpg" alt="${a.articulo.nombre}" style="width: 100px;"></td>
			<td>${a.articulo.nombre}</td>
			<td>${a.articulo.descripcion}</td>
			<td>${a.articulo.precio}</td>
			<td>${a.cantidad}</td>
			<td>${(a.articulo.precio*a.cantidad)}</td>
			<td>
			<button class="btn btn-primary" onclick="cart.modificaUnidades('${a.articulo.codigo}',1)">+</button>
			<button class="btn btn-warning" onclick="cart.modificaUnidades('${a.articulo.codigo}',-1)">-</button>
			<button class="btn btn-danger" onclick="cart.borraArticulo('${a.articulo.codigo}')">Delete</button></td>
			</tr>
			`;
		});
		content += "</table>";
		let dialogBox = document.getElementById("dialogContent");
		dialogBox.innerHTML = content;
		dialog.showModal();

	}			
}
