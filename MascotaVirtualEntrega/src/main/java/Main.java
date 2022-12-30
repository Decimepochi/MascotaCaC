import java.sql.Connection;

import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import modelos.Duke;
import modelos.Perro;
import persistencia.collecions.MascotaPersistenceUseList;
import persistencia.mysql.MySQLConnection;
import utils.RegistroCivilMascotas;

public class Main {

    public static void main(String[] args) {
        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        Perro cersei = new Perro("Cersei", "Wada");
        persistence.guardar(cersei);

        cersei.comer(AlmacenAlimentos.PORORO);
        cersei.jugar(EntretenimientosEnum.BASQUET);
        RegistroCivilMascotas.guardarActa(cersei);

        MySQLConnection conexion = new MySQLConnection();
        Connection connection = conexion.establecerConexion();

        conexion.cerrarConexion(connection);

    }
}