package CarlosCortes.Biblioteca.DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LibroDTO {
    private ObjectId id;
    private String titulo;
    private String idAutor;
    private String fechaPublicacion;
    private String isbn;
    private int paginas;
    private String editorial;
    private String idioma;

}