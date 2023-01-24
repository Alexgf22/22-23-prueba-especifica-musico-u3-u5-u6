class Pianista(
    instrumento: Instrumento,
    partitura: Array<Nota?> = arrayOfNulls(0)): Musico(instrumento,partitura) {

    protected val instrumento1 = instrumento
    val partitura1 = partitura


    override fun interpretar(partitura: Array<Nota?>) {
        i("Pianista.intepretar","####### - SOY PIANISTA")
        println("####### - SOY PIANISTA")
        instrumento1.play(partitura1)
    }


}