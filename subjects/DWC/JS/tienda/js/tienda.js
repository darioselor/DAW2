	criterios=["Sin ordenar","Ascendente por precio", "Descendente por precio"]
	
	function creaListaCriterios(){
		
	}


	function pintaArticulos(){
		let articulosDiv = document.getElementById("contenedor");
		listaArticulos.forEach(a => {
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
	
	
	function ponArticuloEnCarrito(){
		
	}


	function verCarro(){
	
	}

	function efectuaPedido(){
	
	}

	window.onload=()=>{
		pintaArticulos();
	}

