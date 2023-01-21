/**
 *
 */
open class Instrumento() {
    private var melodia: MutableList<Nota?> = mutableListOf()

    open fun reset() {
        melodia = mutableListOf()
    }
    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    open fun play(melodia: Array<Nota?>) {
    }
}
