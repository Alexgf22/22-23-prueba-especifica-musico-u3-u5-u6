/**
 * La clase AlumnoMusica hereda de la interfaz Interprete y puede tocar cualquier
 * instrumento. Incluye el método interpretar.
 */
class AlumnoMusica(
    instrumento: Instrumento,
    partitura: Array<Nota?> = arrayOfNulls(0)) : Interprete {

    private val instrumento1 = instrumento
    val partitura1 = partitura

    /**
     * El método interpretar hace una llamada al método play para que de esa forma el instrumento
     * pueda interpretar la melodía.
     */
    override fun interpretar() {
        i("AlumnoMusica.intepretar","####### - SOY AlUMNO DE MUSICA")
        println("####### - SOY AlUMNO DE MUSICA")
        instrumento1.play(partitura1)

    }


}