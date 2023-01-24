/**
 * La clase Guitarra hereda de la clase Instrumento. Incluye la variable privada
 * melodia y los métodos: incorporaNota(), reset() y play()
 */
class Guitarra : Instrumento() {


    private var melodia: MutableList<Nota?> = mutableListOf()

    /**
     * El método incorporaNota se ha sobreescrito de la superclase.
     * Incorpora en la MutableList de melodia cada nota nueva.
     * @param nota tipo Nota que corresponde al Enum.
     */
    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }



    /**
     * El método play sobreescrito de la superclase se le pasa por parámetro la
     * melodia y a continuación va recorriendo la lista y según la nota que sea
     * la interpreta específicamente para la guitarra.
     * @param melodia de tipo Array<Nota?> partitura que puede tener 0 o más notas musicales.
     */
    override fun play(melodia: Array<Nota?>) {
        i("Guitarra.play","===> Tocando guitarra")
        println("===> Tocando guitarra")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dorrr ")
                Nota.RE -> print("rerrr ")
                Nota.MI -> print("mirrr ")
                Nota.FA -> print("farrr ")
                Nota.SOL -> print("solrrr ")
                Nota.LA -> print("larrr ")
                Nota.SI -> print("sirrr ")
                else -> {}
            }
        }
        println()
        println()

    }
}