class Pianista(unaPartitura: Array<Nota?> = arrayOfNulls<Nota?>(0)): Interprete {

    private val piano = Piano()
    var partitura: Array<Nota?> = unaPartitura
        set(value) {
            field = value
            piano.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaPartitura
        i("Pianista.init", "Inicializado el Pianista")
    }

    override fun interpretar() {
        i("Pianista.intepretar","Interpretando una partitura")
        piano.play()
    }

    override fun play() {
        TODO("Not yet implemented")
    }
}