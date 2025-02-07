// Definicion clase Matricula		
class claseMatricula {

	dni;
	name;
	modules;
		constructor() {
		this.dni = null;
		this.name = null
		this.modules = [];
	}

	anyadeModule(module) {
		if (!this.modules.includes(module)) {
			this.modules.push(module);
		}
	}

	borraModule(module) {
		const index = this.modules.indexOf(module);
		if (index > -1) {
			this.modules.splice(index, 1);
		}
	}

	updatePersonalData(dni, name) {
		this.dni = dni;
		this.name = name;
	}
}

