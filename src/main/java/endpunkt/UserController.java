package endpunkt;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity <List<UserResponseDTO>> getUsers()
    {
        List<UserResponseDTO> result = List.of(
                new UserResponseDTO(1L, "FIWy", "FIWy@mail.de", new RoleResponseDTO(1L, "admin")),
                new UserResponseDTO(2L, "Maus", "Maus@mail.de", new RoleResponseDTO(2L, "user"))
        );

        return ResponseEntity.ok(result);
    }

}