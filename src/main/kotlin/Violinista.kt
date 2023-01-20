class Violinista(
    instrumento: Instrumento,
    partitura: Array<Nota?> = arrayOfNulls(0)): Musico(instrumento,partitura) {

    protected val instrumento1 = instrumento
    val partitura1 = partitura

    override fun interpretar(partitura: Array<Nota?>) {
        i("Violinista.intepretar","Interpretando una partitura")
        instrumento1.play(partitura1)
    }


}