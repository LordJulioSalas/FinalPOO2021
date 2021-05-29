package OficinaVeterinaria.domino;

import java.util.List;


public class Veterinaria {
    private String nombre;
    private List<Mascota> mascotaList;



    public Mascota RevisarMascota(String nombre,String sexo,int edad, boolean esterelizado){
        if(edad>12 && sexo == "Macho" && esterelizado== false) {
            Mascota mascota = new MascotaApta(nombre, sexo, edad, esterelizado);
            return mascota;

        }
        else if (edad>18 && sexo == "Hembra" && esterelizado == false){
            Mascota mascota = new MascotaApta(nombre, sexo, edad, esterelizado);
            return mascota;
        }
        else if (esterelizado == true){
            Mascota mascota = new MascotaEsterelizada(nombre, sexo, edad, esterelizado);
            return mascota;

        }else{
            Mascota mascota = new MascotaNoApta(nombre, sexo, edad, esterelizado);
            return  mascota;
        }

    }
    public void getPacienteOperar(){
        System.out.println("Mascotas Aptas sin esterilizar: "+"\n");
        for (Mascota mascota:this.mascotaList){
            System.out.println(mascotaList);
        }

    }
    public void operar(){
        for (Mascota mascota: mascotaList){
            if(mascota instanceof MascotaApta){
                ((MascotaApta) mascota).operar();
            }

        }

    }

    public String getNombre() {
        return nombre;
    }

    public List<Mascota> getMascotaList() {
        return mascotaList;
    }

    public void setMascotaList(List<Mascota> mascotaList) {
        this.mascotaList = mascotaList;
    }
}
