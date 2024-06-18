package CarlosCortes.Biblioteca.Repositorio;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import CarlosCortes.Biblioteca.Modelo.Autor;

@Repository

public interface RepositorioAutor extends MongoRepository<Autor, ObjectId> {
}