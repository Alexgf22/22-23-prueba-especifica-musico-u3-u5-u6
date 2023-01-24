//Un piano es un instrumento que interpreta las notas con un timbre muy característico
/**
 * La clase Piano hereda de la clase Instrumento. Incluye la variable privada
 * melodia y los métodos: incorporaNota(), reset() y play()
 */
class Piano : Instrumento() {

    //tabla que almacena las notas a interpretar
    private var melodia: MutableList<Nota?> = mutableListOf()

    /**
     * El método incorporaNota se ha sobreescrito de la superclase.
     * Incorpora en la MutableList de melodia cada nota nueva.
     * @param nota tipo Nota que corresponde al Enum.
     */
    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }



    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    /**
     * El método play sobreescrito de la superclase se le pasa por parámetro la
     * melodia y a continuación va recorriendo la lista y según la nota que sea
     * la interpreta específicamente para el piano.
     * @param melodia de tipo Array<Nota?> partitura que puede tener 0 o más notas musicales.
     */
    override fun play(melodia: Array<Nota?>) {
        i("Piano.play", "===> Tocando piano")
        println("===> Tocando piano")
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
        println()
    }
}