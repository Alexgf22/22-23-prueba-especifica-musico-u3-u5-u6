class AlumnoMusica(
    instrumento: Instrumento,
    partitura: Array<Nota?> = arrayOfNulls(0)) : Interprete {

    protected val instrumento1 = instrumento
    val partitura1 = partitura

    override fun interpretar(partitura: Array<Nota?>) {
        i("AlumnoMusica.intepretar","####### - SOY AlUMNO DE MUSICA")
        instrumento1.play(partitura1)

    }


}