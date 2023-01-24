/**
 * Interfaz Interprete que contiene el método interpretar y de ella heredarán varias subclases como
 * son Musico y AlumnoMusica.
 */
interface Interprete {
    /**
     * Método abstracto interpretar que se deja con el body vacío para que se especialice en cada clase
     * que implemente dicha interfaz.
     */
    fun interpretar()

}