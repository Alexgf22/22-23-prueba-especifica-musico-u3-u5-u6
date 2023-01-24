/**
 * La clase Violin hereda de la clase Instrumento. Incluye la variable privada
 * melodia y los métodos: incorporaNota(), reset() y play()
 */
class Violin : Instrumento() {

    //tabla que guarda las notas a interpretar
    private var melodia: MutableList<Nota?> = mutableListOf()

    /**
     * El método incorporaNota se ha sobreescrito de la superclase.
     * Incorpora en la MutableList de melodia cada nota nueva.
     * @param nota tipo Nota que corresponde al Enum.
     */
    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }


    //Recorreremos las notas y las interpretaremos de la forma específica del violín.
    /**
     * El método play sobreescrito de la superclase se le pasa por parámetro la
     * melodia y a continuación va recorriendo la lista y según la nota que sea
     * la interpreta específicamente para el violín.
     * @param melodia de tipo Array<Nota?> partitura que puede tener 0 o más notas musicales.
     */
    override fun play(melodia: Array<Nota?>) {
        i("Violin.play","===> Tocando violin")
        println("===> Tocando violin")
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
        println()
        println()

    }
}