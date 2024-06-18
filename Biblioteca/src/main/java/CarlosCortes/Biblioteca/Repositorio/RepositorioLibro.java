package CarlosCortes.Biblioteca.Repositorio;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import CarlosCortes.Biblioteca.Modelo.Libro;

@Repository

public interface RepositorioLibro extends MongoRepository<Libro, ObjectId> {

    List<Libro> findByTitle(String titulo);
    List<Libro> findByAuthorId(ObjectId id);
}