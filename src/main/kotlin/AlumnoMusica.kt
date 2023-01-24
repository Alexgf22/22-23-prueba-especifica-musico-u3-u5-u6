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
     * El método interpretar se le pasa como parámetro la partitura con las notas
     * para que el instrumento pueda tocarla.
     * @param partitura tipo Array<Nota?> incluye las notas correspondientes del Enum.
     */
    override fun interpretar(partitura: Array<Nota?>) {
        i("AlumnoMusica.intepretar","####### - SOY AlUMNO DE MUSICA")
        println("####### - SOY AlUMNO DE MUSICA")
        instrumento1.play(partitura1)

    }


}