package CarlosCortes.Biblioteca.Mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import CarlosCortes.Biblioteca.DTO.LibroDTO;
import CarlosCortes.Biblioteca.Modelo.Libro;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MapperLibro {

    LibroDTO toBookDTO(Libro libro);
    Libro toBook(LibroDTO libroDTO);

    static List<LibroDTO> toBookDTOs(List<Libro> libros) {
        throw new UnsupportedOperationException("Unimplemented method 'toBookDTOs'");
    }
    List<Libro> toBooks(List<LibroDTO> libroDTOs);

}