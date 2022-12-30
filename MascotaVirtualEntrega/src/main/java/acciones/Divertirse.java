package acciones;

import enumeradores.EntretenimientosEnum;
import modelos.Mascota;

public class Divertirse {

    public void entretenerseCon(EntretenimientosEnum entretenimiento, Mascota mascota) {
        if(mascota.isLive()){
            int nivelOriginal = mascota.getNivelAburrimiento();
            if(nivelOriginal != 0) {
                mascota.setNivelAburrimiento(mascota.getNivelAburrimiento() - entretenimiento.getDesaburrimiento());
                mascota.setNivelEnergia (mascota.getNivelEnergia() - 10);
                mascota.setNivelHambre (mascota.getNivelHambre() + 15);
                mascota.setNivelCansancio (mascota.getNivelCansancio() + (entretenimiento.getDesaburrimiento()/2));
                mascota.setNivelFelicidad (mascota.getNivelFelicidad() + (entretenimiento.getDesaburrimiento()/2));
                System.out.println("duke acaba de entretenerse con "
                        + entretenimiento
                        + " y su aburrimiento que estaba en " + nivelOriginal
                        + " descendió a " + mascota.getNivelAburrimiento());
            }else{
                System.out.println("Esta mascota no tiene necesidad de entretenerse su nivel de aburrimiento es cero");
            }

        }else{
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
        }
    }
}