class Guitarra : Instrumento() {


    private var melodia: MutableList<Nota?> = mutableListOf()

    fun play(melodia: Array<Nota?>) {
        i("Guitarra.play","####### - SOY AlUMNO DE MUSICA" +
                "===> Tocando guitarra")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dooo ")
                Nota.RE -> print("reee ")
                Nota.MI -> print("miiii ")
                Nota.FA -> print("faaa ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaa ")
                Nota.SI -> print("siiii ")
                else -> {}
            }
        }
        println("FIN")
    }
}