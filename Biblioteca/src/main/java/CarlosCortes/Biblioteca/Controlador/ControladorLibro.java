package CarlosCortes.Biblioteca.Controlador;

import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CarlosCortes.Biblioteca.DTO.LibroDTO;
import CarlosCortes.Biblioteca.Mapper.MapperLibro;
import CarlosCortes.Biblioteca.Modelo.Libro;
import CarlosCortes.Biblioteca.Servicio.ServicioLibro;

@RestController
@RequestMapping("/libros")

public class ControladorLibro {
    @Autowired
    private ServicioLibro servicioLibro;

    @Autowired
    private MapperLibro mapperLibro;

    @GetMapping
    public ResponseEntity<List<LibroDTO>> getAllBooks() {
        List<Libro> libros = servicioLibro.allBooks();
        return new ResponseEntity<>(MapperLibro.toBookDTOs(libros), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<LibroDTO>> getBooksById(@PathVariable ObjectId id) {
        Optional<Libro> libro = servicioLibro.getBooksById(id);
        Optional<LibroDTO> libroDTO = libro.map(mapperLibro::toBookDTO);
        return new ResponseEntity<>(libroDTO, HttpStatus.OK);
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<LibroDTO>> getBooksByTitle(@PathVariable String titulo) {
        List<Libro> libros = servicioLibro.getBooksByTitle(titulo);
        if (!libros.isEmpty()) {
            return new ResponseEntity<>(MapperLibro.toBookDTOs(libros), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/artist/{name}")
    public ResponseEntity<List<LibroDTO>> getBooksByAuthorName(@PathVariable String name) {
        List<Libro> libros = servicioLibro.booksByAuthorName(name);
        return new ResponseEntity<>(MapperLibro.toBookDTOs(libros), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Libro> saveLibro(@RequestBody Libro libro) {
        Libro savedBook = servicioLibro.saveBook(libro);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }
}
