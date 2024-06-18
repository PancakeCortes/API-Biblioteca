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
import CarlosCortes.Biblioteca.Modelo.Autor;
import CarlosCortes.Biblioteca.Servicio.ServicioAutor;

@RestController
@RequestMapping("/autores")

public class ControladorAutor{
    @Autowired
    private ServicioAutor servicioAutor;

    @GetMapping 
    public ResponseEntity<List<Autor>> getAllAuthors() {
        return new ResponseEntity<>(servicioAutor.allAuthors(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Autor>> getAuthorsById(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Autor>>(servicioAutor.getAuthorsById(id), HttpStatus.OK);
    }


}