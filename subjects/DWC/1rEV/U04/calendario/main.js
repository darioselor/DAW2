let meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
let diasMeses = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

//fecha actual y lo convierto al dia 1
let fecha = new Date()
fecha.setDate(1)

//dia de la semana y paso a formato de 1 a 7
let diaSemana = fecha.getDay()
diaSemana = (diaSemana == 0) ? 7 : diaSemana

//saco el mes y los dias del mes
let mes = fecha.getMonth()
let diasMes = diasMeses[mes]

//calculo del tiron
let inicio = 1 - (diaSemana - 1)
let cal = "<table border=1><tr><td>L<td>M<td>X<td>J<td>V<td>S<td>D<tr>"

let n = 0
for (let i = inicio; i <= diasMes; i++) {
    if (n % 7 == 0) cal += "<tr>"
    let texto = (i <= 0) ? " " : i
    cal += "<td>" + texto
    n++
}

cal += "</table>"

document.getElementById("titulo").innerHTML = meses[mes] + " " + fecha.getFullYear()
document.getElementById("calendario").innerHTML = cal