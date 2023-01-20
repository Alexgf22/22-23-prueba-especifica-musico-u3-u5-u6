class AlumnoMusica(override val melodia: Array<Nota?>) : Interprete {

    var instrumento: Instrumento = Guitarra()
    override fun interpretar(partitura: Array<Nota?>) {
        TODO("Not yet implemented")
    }

    override fun play() {
        TODO("Not yet implemented")
    }

    override fun play(instrumento: Instrumento) {
        //instrumento.play(melodia)
    }
}