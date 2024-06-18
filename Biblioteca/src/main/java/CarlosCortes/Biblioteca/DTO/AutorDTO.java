package CarlosCortes.Biblioteca.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AutorDTO {
    @Id
    private ObjectId id;
    private String nombre;
    private String generos;
    private String bio;
}