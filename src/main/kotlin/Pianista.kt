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
     * El método interpretar hace una llamada al método play para que de esa forma el instrumento
     * pueda interpretar la melodía.
     */
    override fun interpretar() {
        i("Pianista.intepretar","####### - SOY PIANISTA")
        println("####### - SOY PIANISTA")
        instrumento1.play(partitura1)
    }


}