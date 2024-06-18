package CarlosCortes.Biblioteca.Servicio;

import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CarlosCortes.Biblioteca.Modelo.Autor;
import CarlosCortes.Biblioteca.Repositorio.RepositorioAutor;
 
@Service
public class ServicioAutor {

    @Autowired
    private RepositorioAutor repositorioAutor;

    public List<Autor> allAuthors() {
        return repositorioAutor.findAll();
    }

    public Optional<Autor> getAuthorsById(ObjectId id) {
        return repositorioAutor.findById(id);
    }

}