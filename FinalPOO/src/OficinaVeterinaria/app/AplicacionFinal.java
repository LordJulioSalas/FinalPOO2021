package OficinaVeterinaria.app;

import OficinaVeterinaria.domino.*;

import java.util.ArrayList;
import java.util.List;

public class AplicacionFinal {
    public static void main(String[] args) {
        List<Mascota> mascotaList = new ArrayList<>();
        Veterinaria veterinaria = new Veterinaria();
        MascotaApta mascotaApta = new MascotaApta("Pedro","Macho",24,false);
        MascotaEsterelizada mascotaEsterelizada = new MascotaEsterelizada("Ramona","Hembra",19,true);
        MascotaNoApta mascotaNoApta = new MascotaNoApta("Juan","Macho",10,false);

        
        veterinaria.setMascotaList(mascotaList);
        mascotaList.add(mascotaApta);
        mascotaList.add(mascotaNoApta);
        mascotaList.add(mascotaEsterelizada);

    }
}
