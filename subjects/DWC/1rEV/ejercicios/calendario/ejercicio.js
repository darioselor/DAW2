let year = new Date().getFullYear;
let monthNumber = new Date().getMonth;
let dayNumber = new Date().getDate;
let dayFromWeek = new Date().getDay;

let months = ["Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
let daysFebruary = year%4==0 ? 29 : 28;
let daysMonth = [31,daysFebruary,31,30,31,30,31,31,30,31,30,31];
let inicio = dayNumber-1;

let cal = "<table border=1><tr><td>L<td>M<td>X<td>J<td>V<td>S<td>D<tr>";

n = 0;
for (i = inicio; i < array.length; i++) {
    
    if (n%7== 0) cal += "<tr>"
    let texto = (i<= 0) ? " " : i;
    cal += "<td>"+ texto;
    n++
}

cal += "</table>"
document.getElementById("titulo").innerHTML= months[monthNumber] + " - " + year;
document.getElementById("calendario").innerHTML = cal;