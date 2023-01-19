class Violinista(unaPartitura: Array<Nota?> = arrayOfNulls<Nota?>(0)): Interprete {

    private val violin = Violin()
    var partitura: Array<Nota?> = unaPartitura
        set(value) {
            field = value
            violin.reset()
            value.forEach { nota ->
                i("Violinista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { violin.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaPartitura
        i("Violinista.init", "Inicializado el Violinista")
    }

    override fun interpretar() {
        i("Violinista.intepretar","Interpretando una partitura")
        violin.play()
    }

    override fun play() {
        TODO("Not yet implemented")
    }
}