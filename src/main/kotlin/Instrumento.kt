open class Instrumento {
    open var melodia: Array<Nota?> = arrayOfNulls(0)
    open fun play(melodia: Array<Nota>) {}
    open fun reset() {
        melodia = arrayOfNulls(0)
    }
    fun incorporaMelodia(melodia: Array<Nota?>) {
        this.melodia = melodia
    }
}
