/**
 *
 */
open class Instrumento() {
    open var melodia: MutableList<Nota?> = mutableListOf()
    open fun play(melodia: MutableList<Nota?>) {}
    open fun reset() {
        melodia = mutableListOf()
    }
    /*fun incorporaMelodia(melodia: MutableList<Nota?>) {
        this.melodia = melodia
    }*/

    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    open fun play(melodia: Array<Nota?>) {}
}
