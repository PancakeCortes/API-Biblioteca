
package CarlosCortes.Biblioteca.Modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "Autores")


public class Autor {

    @Id
    private ObjectId id;
    private String nombre;
    private String generos;
    private String bio;

}
