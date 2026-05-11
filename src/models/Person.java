package models;

public class Person {

    private String nombre;
    private int edad;
    private int[] notas;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Person(String nombre, int edad, int[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre +
           ", Edad: " + edad +
           ", Promedio: " + getPromedio();
    }

    public int getPromedio() {
        if (notas == null || notas.length == 0) {
            return 0;
        }

    int suma = 0;

    for (int nota : notas) {
        suma += nota;
    }

    return suma / notas.length;
}
    public int[] getNotas() {
        return notas;
    }
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getValorName(){
        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                return 5;
            }

            
        }
        return 0;
    }
    

    
    
}
