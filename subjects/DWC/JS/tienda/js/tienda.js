	criterios=["Sin ordenar","Ascendente por precio", "Descendente por precio"]
	let cart;
	function creaListaCriterios(){
		let selectCriterios = document.getElementById("criteriosOrdenacion");
		let cont=0;
		let content = "";
		criterios.forEach(criterio => {
			content += `<option value=${cont}>${criterio}</option>`;
			cont += 1;
		});
		selectCriterios.innerHTML=content;
	}


	function pintaArticulos(criterio){
		const articulosDiv = document.getElementById("contenedor");
		articulosDiv.innerHTML = "";
		console.log(`Pintados con el criterio ${criterio}`);
		let copiaListaArtculos = listaArticulos.slice();
		if (criterio == 1) {
			copiaListaArtculos.sort((a,b)=> a.price - b.price);
		}
		if (criterio == 2) {
			copiaListaArtculos.sort((a,b)=> b.price - a.price);
		}

		copiaListaArticulos.forEach(a => {
			
			let articulo = document.createElement("div");
			articulo.className= `card`;
			
			let imagen = document.createElement("img");
			imagen.id = a.codigo;
			imagen.src = `assets/${a.codigo}.jpg`;
			imagen.className=`card-img-top`;

			let cardBody = document.createElement("div");
			cardBody.className=`card-body`;

			let nombre = document.createElement("h5");
			nombre.innerHTML=`${a.nombre}`;
			nombre.className=`card-title`;

			let descripcion = document.createElement("p");
			descripcion.innerHTML=`${a.descripcion}`;
			descripcion.className=`card-text`;

			let b = document.createElement("b");

			let precio = document.createElement("p");
			precio.innerHTML=`${a.precio}€`;
			precio.className = `card-text text-center`

			let botonComprar = document.createElement("button");
			botonComprar.id = a.codigo;
			botonComprar.className=`btn-success`
			botonComprar.innerHTML=`comprar`
			botonComprar.addEventListener("click", () => ponArticuloEnCarrito(a.codigo))

			articulo.appendChild(imagen);
			articulo.appendChild(cardBody);
			cardBody.appendChild(nombre);
			cardBody.appendChild(descripcion);
			cardBody.appendChild(b);
			b.appendChild(precio);
			articulo.appendChild(botonComprar);
			
			articulosDiv.appendChild(articulo);
		});
	}
	
	function ponArticuloEnCarrito(codigo){
		let articulo = listaArticulos.find(a => a.codigo == codigo);
		cart.anyadeArticulo(articulo);
	}

	function verCarro(){
		cart.verCarrito();
	}
	
	function efectuaPedido(){
		const pedido = {
			"id" : cart.id,
			"articulos": cart.articulosCarrito,
			"total": cart.totalPrecio
		};
		console.log(pedido);
		console.log("Pedido efectuado!");
		dialog.close();
	}
	
	window.onload=()=>{
		let iconoCarrito = document.getElementsByTagName("img")[0];
		iconoCarrito.addEventListener("click", verCarro);
		dialog = document.getElementById("miDialogo");
		const btnCierraDialog = document.getElementById("btnCierraDialog");
		btnCierraDialog.addEventListener("click", () => dialog.close());
		
		const btnEfectuaPedido = document.getElementById("btnEfectuaPedido");
		btnEfectuaPedido.addEventListener("click", () => efectuaPedido());
		
		creaListaCriterios();
		let selectCriterios = document.getElementById("criteriosOrdenacion").onchange = function () {
			let valor = this.value;
			pintaArticulos(valor);
		}; 

		pintaArticulos(0);
		cart = new Carrito(1);

		
	}

