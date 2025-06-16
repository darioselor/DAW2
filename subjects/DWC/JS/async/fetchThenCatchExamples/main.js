fetch(URL)
.then(response => {
    if (!response.OK) {
        throw new Error("Response error");
    }
    return response.json()
})
.then(response => {
    //* Para encadenar promesas de una manera limpia
    //* se debe devolver el fetch en un then para 
    //* poder tratarlo con otro desde fuera
    return fetch(URL + "/" +response.id)
    .then(response => {
        if (!response.ok) {
            throw new Error("Response ID error");
        }
        return response.json()
    })
})
.then(response => console.log(response))
.catch(console.log(Error))

//?          ASYNC / AWAIT

async function getEjemplo(id) {
    const response = await fetch(URL + "/" + id)
    const ejemplo = await response.json()
    console.log(ejemplo);
    
}

async function getEjemploConError(id){
    try {
        const response = await fetch(URL + "/" + id)
        const ejemplo = await response.json()
        console.log(ejemplo);
        
    } catch (error) {
        console.log(error);
        
    }
}