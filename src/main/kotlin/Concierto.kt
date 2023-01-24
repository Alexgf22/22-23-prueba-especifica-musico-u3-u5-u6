fun main() {

    val obra = arrayOf<Nota?>(Nota.MI, Nota.MI, Nota.DO, Nota.FA)
    val interpretes = mutableMapOf<String, Interprete>(
        "Pianista" to Pianista( Piano(), obra),
        "Violinista" to Violinista( Violin(), obra),
        "Alumno musica" to AlumnoMusica(Guitarra(),obra)
    )

    repeat(3)
    {
        interpretes.keys.random().run {
            interpretes[this]?.interpretar()
            interpretes.remove(this)
        }
    }
}