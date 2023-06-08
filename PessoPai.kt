
open class Pessoa(val nome: String, val idade: Int, val genero: String) {
    open fun infos() {
        println("\nnome: $nome\nidade: $idade\ngenero: $genero")
    }
    open fun beija(receptor: Pessoa){
        println("$nome beijou ${receptor.nome}!")
    }
}

class Estudante(nome: String, idade: Int, genero: String, val curso: String) : Pessoa(nome, idade, genero) {
    override fun infos() {
        super.infos()
        println("curso:$curso\n")
    }
}

class Professor(nome: String, idade: Int, genero: String, val disciplina: String) : Pessoa(nome, idade, genero){
    override fun infos() {
        super.infos()
        println("disciplina:$disciplina\n")
    }
}

fun main() {

    val Andre = Pessoa("André", 68, "masculino")
    val Edson = Professor("Edson",57, "masculino", "flamenganismo")
    val Alex = Estudante("Alex", 48, "masculino", "empreendedorismo")

    Edson.infos()
    Andre.infos()
    Alex.infos()
    Edson.beija(Andre) //momento dos orientadores
}
