package br.com.raul.notepadapi.repository

import br.com.raul.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRepository : MongoRepository<Nota, String>{
    @Query("{}")
    fun all():Stream<Nota>


    //O nome do metodo corresponde a query para busca

    fun findByTitulo(titulo:String):Nota
    fun findByTituloAndConteudo(titulo:String,conteudo:String)
}