package OficinaVeterinaria.domino;

public abstract class Mascota {
    private String nombre;
    private String sexo;
    private int edad;
    private boolean esterelizado;

    public Mascota(String nombre, String sexo, int edad, boolean esterelizado) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.esterelizado = esterelizado;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsterelizado() {
        return esterelizado;
    }

    public void setEsterelizado(boolean esterelizado) {
        this.esterelizado = esterelizado;
    }
}

