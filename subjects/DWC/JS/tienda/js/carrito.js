class Carrito{

	id;
	articulosCarrito;

	constructor(id){	
		this.id = id;
        this.articulosCarrito = [];
	}

	anyadeArticulo(articulo){
		console.log(articulo);
		
		if (this.articulosCarrito.find(a => a.codigo === articulo.codigo)) {
			this.modificaUnidades(articulo.codigo, 1);
		} else {
			let cantidad = 1;
			let total = articulo.precio * cantidad;
			this.articulosCarrito.push({...articulo, cantidad, total});
		}
		this.verCarrito();
	}
	
	modificaUnidades(codigo,n){	
		let articulo = this.articulosCarrito.find(a => a.codigo == codigo);
		if (articulo) {
			articulo.cantidad += n;
			if (articulo.cantidad < 1) {
				this.borraArticulo(articulo.codigo);
			} else {
				articulo.total = articulo.precio * articulo.cantidad
			}
			this.verCarrito();
		}	
	}	
	
	borraArticulo(codigo){
		let index = this.articulosCarrito.findIndex(a => a.codigo == codigo);
				if (index !== -1) {
					this.articulosCarrito.splice(index, 1);
				}
				this.verCarrito();

	}
	verCarrito(){
		let content;
		let totalprecio = 0;
		if (this.articulosCarrito.length==0) {
			content=`Este carrito está vacío`;
		} else {
		
		content=`
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
		
		this.articulosCarrito.forEach(a => {
			content += `
			<tr>
			<td><img src= "assets/${a.codigo}.jpg" alt="${a.nombre}" style="width: 100px;"></td>
			<td>${a.nombre}</td>
			<td>${a.descripcion}</td>
			<td>${a.precio}</td>
			<td>${a.cantidad}</td>
			<td>${a.total}</td>
			<td>
			<button class="btn btn-primary" onclick="cart.modificaUnidades('${a.codigo}',1)">+</button>
			<button class="btn btn-warning" onclick="cart.modificaUnidades('${a.codigo}',-1)">-</button>
			<button class="btn btn-danger" onclick="cart.borraArticulo('${a.codigo}')">Delete</button></td>
			</tr>
			`;
			totalprecio = (totalprecio + a.total);
		});
		content += "</table>";
		}
		let totalSpan = document.getElementById("total");
		totalSpan.innerHTML = totalprecio;
		
		let dialogBox = document.getElementById("dialogContent");
		dialogBox.innerHTML = content;
		dialog.showModal();

	}			
}
