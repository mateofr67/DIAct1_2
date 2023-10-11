package tarea1_2;

public class Principal {
    static Alumno[] alumnos = new Alumno[5];
    static int contadorAlumnos = 0;

    public static boolean haAlcanzadoLimite() {
        return contadorAlumnos >= 5;
    }

    public static void agregarAlumno(Alumno nuevoAlumno) {
     
    
         alumnos[contadorAlumnos] = nuevoAlumno;
            contadorAlumnos++;
            System.out.println("Alumno añadido correctamente desde Principal.");
        
    }
 
    public static String encontrarAlumnoMasJoven() {
    Alumno alumnoMasJoven = null;
    int edadMasJoven = Integer.MAX_VALUE;
String nombreCompleto=null;
    for (int i = 0; i < contadorAlumnos; i++) {
        Alumno alumno = alumnos[i];
        if (alumno != null && alumno.getEdad() < edadMasJoven) {
          nombreCompleto = alumnos[i].getNombre() +" "+ alumnos[i].getApellidos();
          
            edadMasJoven = alumno.getEdad();
        }
    }

    return nombreCompleto;
}
    
    
    public static void mostrarAlumnos() {
        System.out.println("Listado de Alumnos:");
        for (int i = 0; i < contadorAlumnos; i++) {
            Alumno alumno = alumnos[i];
            System.out.print("Nombre: " + alumno.getNombre());
            System.out.print("  Apellidos: " + alumno.getApellidos());
            System.out.print("  Edad: " + alumno.getEdad());
            System.out.print("  Email: " + alumno.getEmail());
            System.out.print("  Teléfono: " + alumno.getTelefono());
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        frmAlumno frm = new frmAlumno();
        frm.setVisible(true);
       
        
    }
}