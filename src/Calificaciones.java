public class Calificaciones {
    String nombre;
    float [] calificacion = new float[5];
    public Calificaciones(String nombre, float[] calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float[] calificacion) {
        this.calificacion = calificacion;
    }

    public float promedio(){

        float suma = 0;
        float promedioFinal;

        for (int i = 0; i<calificacion.length; i++){
            suma += calificacion[i];
        }

        promedioFinal = suma / calificacion.length;

        return promedioFinal;
    }
    public char calFinal(){

        char nota = 'a';
        float promedioFinal = promedio();


        if (promedioFinal < 50){
            nota = 'F';
        }
        else if (promedioFinal >= 51 && promedioFinal <= 60){
            nota = 'E';
        }
        else if (promedioFinal >= 61 && promedioFinal <= 70){
            nota = 'D';
        }
        else if (promedioFinal >= 71 && promedioFinal <= 80){
            nota = 'C';
        }
        else if (promedioFinal >= 81 && promedioFinal <= 90){
            nota = 'B';
        }
        else if (promedioFinal >= 91 && promedioFinal <= 100){
            nota = 'A';
        }
        else {
            System.out.println("Promedio no valido");
        }

        return nota;
    }
    public void resultados(){

        System.out.println("Nombre del estudiante: " + nombre);

        for (int i = 0; i<calificacion.length; i++){
            System.out.println("Calificacion " + (i+1) + " es: " + calificacion[i]);
        }

        System.out.println("El promedio es: " + promedio());
        System.out.println("Su calificacion final es: " + calFinal());
    }
}
