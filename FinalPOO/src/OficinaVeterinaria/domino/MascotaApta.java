package OficinaVeterinaria.domino;

public class MascotaApta extends Mascota implements Operable{

    public MascotaApta(String nombre, String sexo, int edad, boolean esterelizado) {
        super(nombre, sexo, edad, esterelizado);
    }

    @Override
    public void operar() {
        setEsterelizado(true);

    }
}
