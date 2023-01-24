/**
 * La clase Pianista hereda de la interfaz Interprete y puede tocar cualquier
 * instrumento. Incluye el método interpretar.
 */
class Pianista(
    instrumento: Instrumento,
    partitura: Array<Nota?> = arrayOfNulls(0)): Musico(instrumento,partitura) {

    private val instrumento1 = instrumento
    val partitura1 = partitura

    /**
     * El método interpretar se le pasa como parámetro la partitura con las notas
     * para que el instrumento pueda tocarla.
     * @param partitura tipo Array<Nota?> incluye las notas correspondientes del Enum.
     */
    override fun interpretar(partitura: Array<Nota?>) {
        i("Pianista.intepretar","####### - SOY PIANISTA")
        println("####### - SOY PIANISTA")
        instrumento1.play(partitura1)
    }


}