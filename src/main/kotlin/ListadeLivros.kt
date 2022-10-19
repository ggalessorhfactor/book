fun main(){
    val livro1 = Livro(
        titulo = "Hábitos atomicos",
        autor = "James Clear",
        anoPublicacao = 2018
    )

    val livro2 = Livro(
        titulo = "O mundo assombrado pelos demonios",
        autor = "Carl Sagan",
        anoPublicacao = 1995,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Uma breve história sobre o tempo",
        autor = "Stephen Hawking",
        anoPublicacao = 1988
    )

    val livro4 = Livro(
        titulo = "Sapiens: Uma breve história da humanidade",
        autor = "Yuval Noah Harari",
        anoPublicacao = 2011,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.imprimeComMarcadores()

    livros.add(
        Livro(
            titulo = "O gene egoísta",
            autor = "Richard Dawkins",
            anoPublicacao = 1976
        )
    )

    livros.remove(livro1)

    livros.imprimeComMarcadores()
}
