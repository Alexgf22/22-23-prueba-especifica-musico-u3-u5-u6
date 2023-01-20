abstract class Musico(instrumento: Instrumento, partitura: Array<Nota?> = arrayOfNulls(0)) : Interprete {


    private val instrumento1 = instrumento
    private var partitura1: Array<Nota?> = partitura


    set(value) {
        field = value
        instrumento1.reset()
        value.forEach { nota ->
            i("Musico.setPartitura", "incorpora nota $nota de canción")
            nota?.let { instrumento1.incorporaNota(nota) }
        }
    }

    init {
        i("Musico.init", "Inicializado el Musico")
    }


    override fun interpretar(partitura: Array<Nota?>) {
        i("Musico.intepretar","Interpretando una partitura")
        instrumento1.play(partitura)
    }








}