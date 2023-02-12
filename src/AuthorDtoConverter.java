public class AuthorDtoConverter {
    public static AuthorDto convertToDTO(Author author) {
        return new AuthorDto(author.getId(), author.getName());
    }

    public static Author convertToEntity(AuthorDto authorDTO) {
        return new Author(authorDTO.getId(), authorDTO.getName());
    }
}
