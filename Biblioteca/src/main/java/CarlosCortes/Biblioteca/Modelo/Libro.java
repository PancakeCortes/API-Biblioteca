package CarlosCortes.Biblioteca.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Libros")


public class Libro {

    @Id
    private ObjectId id;
    private String titulo;
    private String idAutor;
    private String fechaPublicacion;
    private String isbn;
    private int paginas;
    private String editorial;
    private String idioma;
 
    
}
