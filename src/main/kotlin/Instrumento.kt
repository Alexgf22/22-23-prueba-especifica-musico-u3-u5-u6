/**
 * La clase Instrumento es open ya que de ella heredarán las subclases: Guitarra,
 * Violín y Piano. Además tiene los métodos: reset(), incorporaNota() y play().
 */
open class Instrumento {

    private var melodia: MutableList<Nota?> = mutableListOf()

    /**
     * El método reset lo que hace es
     * limpiar la MutableList de melodia y la deja vacía.
     */
     open fun reset() = melodia.clear()

    /**
     * El método incorporaNota se le pasa por parámetro una nota del Enum Nota y
     * se deja el body vacío para que cada una de las subclases especifique su
     * funcionamiento. Será open para que pueda ser sobreescrito.
     * @param nota de tipo Nota. Será una de las notas musicales del Enum.
     */
    open fun incorporaNota(nota: Nota) {

    }

    /**
     * El método play es open para que pueda ser sobreescrito por las subclases,
     * se le pasa por parámetro la melodia con las notas correspondientes y se deja
     * el body vacío para que cada clase pueda tener su propio funcionamiento.
     * @param melodia de tipo Array<Nota?> que puede contener 0 o más notas musicales.
     */
    open fun play(melodia: Array<Nota?>) {

    }
}
