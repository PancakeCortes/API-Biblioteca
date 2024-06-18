package CarlosCortes.Biblioteca.Mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import CarlosCortes.Biblioteca.DTO.AutorDTO;
import CarlosCortes.Biblioteca.Modelo.Autor;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MapperAutor {
    AutorDTO toAutorDTO(Autor autor);
    Autor toAutor(AutorDTO autorDTO);
    List<AutorDTO> toAuthorDTOs(List<Autor> autors);
    List<Autor> toAuthors(List<AutorDTO> autorDTOs);
}