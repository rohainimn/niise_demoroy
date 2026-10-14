package my.gov.imi.niise_demoroy;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PenggunaDto {

    @NotNull(message = "Name is required")
    private String nama;

    private String icno;

    @NotNull(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password; 

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

}