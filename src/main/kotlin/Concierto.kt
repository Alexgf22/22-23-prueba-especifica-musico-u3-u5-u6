class Concierto {
}



fun main() {
    val interprete1 = Pianista()
    val interprete2 = Violinista()
    val interprete3 = AlumnoMusica()
    val interpretes = arrayListOf(interprete1, interprete2, interprete3)

    val piano = Piano()
    val violin = Violin()
    val guitarra = Guitarra()

    val partituraPiano = arrayOf<Nota?>(Nota.DO, Nota.FA, Nota.FA, Nota.MI)
    val partituraGuitarra = arrayOf<Nota?>(Nota.DO, Nota.LA, Nota.SI, Nota.FA)
    val partituraViolin = arrayOf<Nota?>(Nota.SI, Nota.LA, Nota.LA, Nota.DO)

    for (interprete in interpretes) {
        when (interprete) {
            is Pianista -> {
                interprete.play(piano)
                interprete.interpretar(partituraPiano)
            }
            is Violinista -> {
                interprete.play(violin)
                interprete.interpretar(partituraViolin)
            }
            is AlumnoMusica -> {
                interprete.play(guitarra)
                interprete.interpretar(partituraGuitarra)
            }
        }
    }
}
