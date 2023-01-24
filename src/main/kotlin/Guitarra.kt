class Guitarra : Instrumento() {


    private var melodia: MutableList<Nota?> = mutableListOf()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    override fun reset() = melodia.clear()

    override fun play(melodia: Array<Nota?>) {
        i("Guitarra.play","===> Tocando guitarra")
        println("===> Tocando guitarra")
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
        println()

    }
}