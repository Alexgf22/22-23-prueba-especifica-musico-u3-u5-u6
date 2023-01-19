open class Instrumento {
    var melodia: Array<Nota?> = arrayOfNulls(0)
    open fun play(melodia: Array<Nota>) {}
    fun reset() {
        melodia = arrayOfNulls(0)
    }
    fun incorporaMelodia(melodia: Array<Nota?>) {
        this.melodia = melodia
    }
}