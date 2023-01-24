class Violinista(
    instrumento: Instrumento,
    partitura: Array<Nota?> = arrayOfNulls(0)): Musico(instrumento,partitura) {

    private val instrumento1 = instrumento
    val partitura1 = partitura

    override fun interpretar(partitura: Array<Nota?>) {
        i("Violinista.intepretar","####### - SOY VIOLINISTA")
        println("####### - SOY VIOLINISTA")
        instrumento1.play(partitura1)
    }


}