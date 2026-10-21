package endpunkt;

public record UserResponseDTO(Long id, String username, String email, RoleResponseDTO role) {}
