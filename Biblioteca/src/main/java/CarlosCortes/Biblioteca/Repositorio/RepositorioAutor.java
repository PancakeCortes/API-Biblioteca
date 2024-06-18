package CarlosCortes.Biblioteca.Repositorio;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import CarlosCortes.Biblioteca.Modelo.Autor;


@Repository

public interface RepositorioAutor extends MongoRepository<Autor, ObjectId> {


    List<Autor> findByNames(String nombre);
    List<Autor> findByAuthorId(ObjectId id);

}