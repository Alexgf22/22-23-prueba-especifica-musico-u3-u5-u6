class Concierto {
}


fun main() {
    val pianista = Pianista().apply {
        partitura = arrayOf<Nota?>(Nota.DO, Nota.FA, Nota.FA, Nota.MI)
    }
    pianista.interpretar()

    val interpretes = mutableListOf<Interprete>()
}