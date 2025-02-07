# Propagación de eventos: Bubbling and capturing

La propagación de eventos es el orden en el que se ejecutarán los eventos si se clica sobre un elemento dentro de otro y ambos tienen eventos asignados.

- Bubbling: El hijo se maneja antes que el padre.
- Capturing: Es el padre el que se maneja primero.

Mediante el parámetro boolean useCapture del addEventListener() asignamos que propagación queremos utilizar.

False: Bubbling.
True: Capturing.

```html
<style>
  #myDiv1,
  #myDiv2 {
    background-color: coral;
    padding: 50px;
  }
  #myP1,
  #myP2 {
    background-color: white;
    padding: 20px;
  }
</style>
<body>
  <h2>Bubling and Capturing</h2>
  <div id="myDiv1">
    <h2>Bubbling:</h2>
    <p id="myP1">Haz click !!!</p>
  </div>
  <br />
  <div id="myDiv2">
    <h2>Capturing:</h2>
    <p id="myP2">Haz click !!!</p>
  </div>
</body>
```

```js
function clickOnP(){
alert("Click en Parrafo blanco");
 }
function clickOnDiv(){
alert("Click en DIV naranja");
 }
document.getElementById("myP1").addEventListener("click",clickOnP,fals
e);
document.getElementById("myDiv1").addEventListener("click",
clickOnDiv,false);
document.getElementById("myP2").addEventListener("click", clickOnP,
true);
document.getElementById("myDiv2").addEventListener("click",
clickOnDiv, true);
```
