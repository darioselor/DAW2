let alumnos=[{'codigo':'DAW-1-2020',
    'nombre':'Pepe',
    'ciudad':'Valencia',
    'calificaciones':[{'asignatura':'PRG','nota':9},
                    {'asignatura':'GBD','nota':6}, 
                    {'asignatura':'ING','nota':4},
                    {'asignatura':'FOL','nota':3}
                    ],
    'edad':24},
    {'codigo':'DAW-2-2020',
    'nombre':'Juan',
    'ciudad':'Castellon',
    'calificaciones':[{'asignatura':'DWC','nota':4},
                    {'asignatura':'DWS','nota':6}, 
                    {'asignatura':'DAW','nota':7},
                    {'asignatura':'DIW','nota':8},
                    {'asignatura':'ING','nota':9},
                    {'asignatura':'EIE','nota':2}
                    ],
    'edad':28},
    {'codigo':'DAW-1-2019',
    'nombre':'Ana',
    'ciudad':'Valencia',
    'calificaciones':[{'asignatura':'PRG','nota':6},
                    {'asignatura':'GBD','nota':2}, 
                    {'asignatura':'ING','nota':6},
                    {'asignatura':'FOL','nota':2}
                    ],
    'edad':22},
    {'codigo':'DAW-2-2020',
    'nombre':'Maria',
    'ciudad':'Castellon',
    'calificaciones':[{'asignatura':'DWC','nota':4},
                    {'asignatura':'DWS','nota':6}, 
                    {'asignatura':'DAW','nota':7},
                    {'asignatura':'DIW','nota':8},
                    {'asignatura':'ING','nota':4},
                    {'asignatura':'EIE','nota':1}
                    ],
    'edad':30}
                ];

function notasAlumno() {
    let alumnoName = prompt("Introduce el nombre del alumno");
    let pos = alumnos.findIndex(a => a.nombre == alumnoName);
    if (pos == -1) {
        alert(`No se ha encontrado un alumno con el nombre ${alumnoName}`);
    } else {
        let notaMedia = 0;
        let notaMasAlta = 0;
        let notaMasBaja = 10;
        let asignaturaNotaMasAlta = "";
        let asignaturaNotaMasBaja = "";
        alumnos[pos].calificaciones.map(c=> {
            notaMedia += c.nota
            if (c.nota > notaMasAlta) {
                notaMasAlta = c.nota;
                asignaturaNotaMasAlta = c.asignatura;
            } else if (c.nota < notaMasBaja) {
                notaMasBaja = c.nota;
                asignaturaNotaMasBaja = c.asignatura;
            };
        });
        notaMedia = notaMedia / alumnos[pos].calificaciones.length;
        console.log(`Alumno: ${alumnoName}
            Nota Media: ${notaMedia}
            Mejor Asignatura: ${asignaturaNotaMasAlta}
            Nota Mejor Asingatura ${notaMasAlta}
            Peor Asignatura ${asignaturaNotaMasBaja}
            Nota Peor Asignatura ${notaMasBaja}`);
        
    }
}

function subeUnPunto() {
    alumnos.forEach(a => {
        a.calificaciones.map(c=>{
            c.nota += 1;
        })
        console.log(a); // No hace falta que esté dentro del bucle
        
    });

}