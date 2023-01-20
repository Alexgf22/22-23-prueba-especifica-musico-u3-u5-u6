abstract class Musico(instrumento: Instrumento, partitura: Array<Nota?> = arrayOfNulls(0)) : Interprete {


    private val instrumento1 = instrumento
    private var partitura1: Array<Nota?> = partitura
        set(value) {
            field = value
            instrumento1.reset()
            value.forEach { nota ->
                i("Violinista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento1.incorporaNota(nota) }
            }
        }

    init {
        i("Violinista.init", "Inicializado el Violinista")
    }


    override fun interpretar(partitura: Array<Nota?>) {
        i("Violinista.intepretar","Interpretando una partitura")
        instrumento1.play(partitura)
    }








}