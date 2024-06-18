package CarlosCortes.Biblioteca.Servicio;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CarlosCortes.Biblioteca.Modelo.Libro;
import CarlosCortes.Biblioteca.Repositorio.RepositorioLibro;
import CarlosCortes.Biblioteca.Repositorio.RepositorioAutor;
 
@Service
public class ServicioLibro {

    @Autowired
    private RepositorioLibro repositorioLibro;

    @Autowired
    private RepositorioAutor repositorioAutor;

    public List<Libro> allBooks() {
        return repositorioLibro.findAll();
    }

    public Optional<Libro> getBooksById(ObjectId id) {
        return repositorioLibro.findById(id);
    }

    public List<Libro> getBooksByTitle(String titulo) {
        return repositorioLibro.findByTitle(titulo);
    }

    public List<Libro> booksByAuthorName(String nombre) {
        return repositorioAutor.findByNames(nombre).stream()
                .findFirst()
                .map(author -> repositorioLibro.findByAuthorId(author.getId()))
                .orElseGet(Collections::emptyList);
    }
    

}