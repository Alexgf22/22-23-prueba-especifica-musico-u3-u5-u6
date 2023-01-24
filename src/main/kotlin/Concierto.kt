fun main() {
    /*val obra2 = mutableListOfa<Nota?>(Nota.MI, Nota.MI, Nota.DO, Nota.LA)
    var pianista1 = Piano()
    println(pianista1.play(obra2))
    pianista1.incorporaNota(Nota.RE)
    println(pianista1.play(obra2))*/





    val obra = arrayOf<Nota?>(Nota.MI, Nota.MI, Nota.DO, Nota.FA)
    val interpretes = mutableMapOf<String, Interprete>(
        "Pianista" to Pianista( Piano(), obra),
        "Violinista" to Violinista( Violin(), obra),
        "Alumno musica" to AlumnoMusica(Guitarra(),obra)
    )

    repeat(3)
    {
        interpretes.keys.random().run {
            interpretes[this]?.interpretar(obra)
            interpretes.remove(this)
        }
    }
}