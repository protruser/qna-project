package user.domain.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class LoginRequest {

    @NotEmpty(message = "이메일은 필수항목입니다.")
    private String email;

    private String password;
}
