export interface Articulo {
  id:string,
  nombre:string,
  descripcion:string,
  unidades:number,
  precio:number,
  categoria:string,
}

export const ARTICULOS: Articulo[] = [
  {
    'id':'m1',
    'nombre':'Galaxy A32',
    'descripcion':'4GB + 128GB libre',
    'unidades':10,
    'precio':229,
    'categoria':'movil'
  },
  {
    'id':'m2',
    'nombre':'Oppo A94',
    'descripcion':'8GB + 128GB libre',
    'unidades':10,
    'precio':269,
    'categoria':'movil'
  },
  {
    'id':'m3',
    'nombre':'Galaxy S22',
    'descripcion':'5G Amoled libre',
    'unidades':10,
    'precio':859,
    'categoria':'movil'
  },
  {
    'id':'m4',
    'nombre':'Apple iPhone',
    'descripcion':'14 Pro móvil libre',
    'unidades':0,
    'precio':339,
    'categoria':'movil'
  },
  {
    'id':'m5',
    'nombre':'Galaxy Z Flip4',
    'descripcion':'5G móvil libre',
    'unidades':10,
    'precio':1990,
    'categoria':'movil'
  },
  {
    'id':'m6',
    'nombre':'Note 11',
    'descripcion':'6GB + 128GB',
    'unidades':10,
    'precio':300,
    'categoria':'movil'
  },
  {
    'id':'m7',
    'nombre':'Realme 9',
    'descripcion':'8GB + 128GB',
    'unidades':10,
    'precio':300,
    'categoria':'movil'
  },
  {
    'id':'p1',
    'nombre':'Asus Zen',
    'descripcion':'i5 16Gb SSD',
    'unidades':10,
    'precio':900,
    'categoria':'portatil'
},
  {
    'id':'p2',
    'nombre':'HP Pavillion',
    'descripcion':'SSD Windows 11',
    'unidades':10,
    'precio':750,
    'categoria':'portatil'
  },
  {
    'id':'p3',
    'nombre':'MacBook',
    'descripcion':'MacOs 13,3"',
    'unidades':10,
    'precio':1115,
    'categoria':'portatil'
  },
  {
    'id':'t1',
    'nombre':'Xiaomi P1E',
    'descripcion':'Android 9 HDR10',
    'unidades':10,
    'precio':300,
    'categoria':'television'
  },
  {
    'id':'t2',
    'nombre':'Toshiba 55UAG',
    'descripcion':'Android UHD 4K',
    'unidades':10,
    'precio':450,
    'categoria':'television'
  },
  {
    'id':'t3',
    'nombre':'Samsung UE305',
    'descripcion':'Full HD, HDR',
    'unidades':10,
    'precio':350,
    'categoria':'television'
  }
]