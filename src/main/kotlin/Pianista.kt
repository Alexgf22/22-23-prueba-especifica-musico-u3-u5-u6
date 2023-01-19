class Pianista(unaPartitura: Array<Nota?> = arrayOfNulls<Nota?>(0)): Interprete {

    var instrumento = Piano()
    var partitura: Array<Nota?> = unaPartitura
        set(value) {
            field = value
            instrumento.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaPartitura
        i("Pianista.init", "Inicializado el Pianista")
    }


    override fun interpretar(partitura: Array<Nota?>) {
        i("Pianista.intepretar","Interpretando una partitura")
        instrumento.play(arrayOf(Nota.FA,Nota.DO,Nota.RE))
    }

    override fun play(instrumento: Instrumento) {
        TODO("Not yet implemented")
    }
}