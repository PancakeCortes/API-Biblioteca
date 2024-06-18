package CarlosCortes.Biblioteca.Controlador;

import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CarlosCortes.Biblioteca.Modelo.Libro;
import CarlosCortes.Biblioteca.Servicio.ServicioLibro;

@RestController
@RequestMapping("/libros")

public class ControladorLibro {
    @Autowired
    private ServicioLibro servicioLibro;

    @GetMapping
     public ResponseEntity<List<Libro>> getAllBooks() {
        return new ResponseEntity<>(servicioLibro.allBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Libro>> getBookById(@PathVariable ObjectId id) {
        return new ResponseEntity<>(servicioLibro.getBooksById(id), HttpStatus.OK);
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Libro>> getBooksByTitle(@PathVariable String titulo) {
        List<Libro> libros = servicioLibro.getBooksByTitle(titulo);
        if (!libros.isEmpty()) {
            return new ResponseEntity<>(libros, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
