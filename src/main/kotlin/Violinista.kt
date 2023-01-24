/**
 * La clase Violinista hereda de la interfaz Interprete y puede tocar cualquier
 * instrumento. Incluye el método interpretar.
 */
class Violinista(
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
        i("Violinista.intepretar","####### - SOY VIOLINISTA")
        println("####### - SOY VIOLINISTA")
        instrumento1.play(partitura1)
    }


}