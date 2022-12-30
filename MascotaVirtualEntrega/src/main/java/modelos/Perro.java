package modelos;

public class Perro extends Mascota{

    public Perro(String nombre, String propietario) {

        super (nombre, propietario);
    }

    public String toString() {
        return "El Perro que se llama: " + nombre + '\n'
                + "nacio el dia " + fechaNacimiento.getDayOfWeek() + ", "
                + fechaNacimiento.getDayOfMonth() + " de "
                + fechaNacimiento.getMonth() + " del año "
                + fechaNacimiento.getYear() + '\n'
                + "a la hora: " + fechaNacimiento.getHour() + ":"
                + fechaNacimiento.getMinute() + '\n'
                + "actualmente se encuenta " + ((isLive) ? "vivo\n" : "muerto\n")
                + "su nivel de Energia se encuentra en: " + nivelEnergia + "%\n"
                + "el nivel de Hambre en: " + nivelHambre + '\n'
                + "nivel de Cansancio: " + nivelCansancio + '\n'
                + "nivel de Felicidad: " + nivelFelicidad + '\n'
                + "nivel de aburrimiento: " + nivelAburrimiento + '\n'
                + "y su actual propietario es: " + propietario + '\n';
    }
}
