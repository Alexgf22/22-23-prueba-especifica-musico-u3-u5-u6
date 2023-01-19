
class Violin{

    //tabla que guarda las notas a interpretar
    private var melodia = mutableListOf<Nota>()

    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    fun reset() = melodia.clear()

    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    fun play() {
        i("Violin.play","Tocando violin")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doggg ")
                Nota.RE -> print("reggg ")
                Nota.MI -> print("miggg ")
                Nota.FA -> print("faggg ")
                Nota.SOL -> print("solggg ")
                Nota.LA -> print("laggg ")
                Nota.SI -> print("siggg ")
            }
        }
        println("FIN")
    }
}