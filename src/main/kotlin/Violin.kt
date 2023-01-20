
class Violin : Instrumento() {

    //tabla que guarda las notas a interpretar
    override var melodia: MutableList<Nota?> = mutableListOf()

    override fun reset() = melodia.clear()

    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun play(melodia: Array<Nota?>) {
        i("Violin.play","####### - SOY VIOLINISTA" +
                "===> Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doggg ")
                Nota.RE -> print("reggg ")
                Nota.MI -> print("miggg ")
                Nota.FA -> print("faggg ")
                Nota.SOL -> print("solggg ")
                Nota.LA -> print("laggg ")
                Nota.SI -> print("siggg ")
                else -> {}
            }
        }
        println("FIN")
    }
}