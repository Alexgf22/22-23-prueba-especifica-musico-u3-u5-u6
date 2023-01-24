/**
 * La clase Musico hereda de la interfaz Interprete. Incluye la variable del instrumento,
 * hace con el set: incorporar las notas y tiene el método interpretar.
 * @property instrumento de tipo Instrumento. Se le puede pasar cualquiera de los instrumentos
 * que hereden de Instrumento.
 * @property partitura de tipo Array<Nota?> incluye las notas correspondientes.
 */
abstract class Musico(instrumento: Instrumento, partitura: Array<Nota?> = arrayOfNulls(0)) : Interprete {


    private val instrumento1 = instrumento
    private var partitura1: Array<Nota?> = partitura


    set(value) {
        field = value
        instrumento1.reset()
        value.forEach { nota ->
            i("Musico.setPartitura", "incorpora nota $nota de canción")
            nota?.let { instrumento1.incorporaNota(nota) }
        }
    }

    // Se inicializa
    init {
        i("Musico.init", "Inicializado el Musico")
    }


    /**
     * El método interpretar se le pasa como parámetro la partitura con las notas
     * para que el instrumento pueda tocarla.
     * @param partitura tipo Array<Nota?> incluye las notas correspondientes del Enum.
     */
    override fun interpretar(partitura: Array<Nota?>) {
        i("Musico.intepretar","Interpretando una partitura")
        instrumento1.play(partitura)
    }








}