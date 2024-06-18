package CarlosCortes.Biblioteca.Servicio;

import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CarlosCortes.Biblioteca.Modelo.Libro;
import CarlosCortes.Biblioteca.Repositorio.RepositorioLibro;
 
@Service
public class ServicioLibro {

    @Autowired
    private RepositorioLibro repositorioLibro;

    public List<Libro> allBooks() {
        return repositorioLibro.findAll();
    }

    public Optional<Libro> getBooksById(ObjectId id) {
        return repositorioLibro.findById(id);
    }

}