package ie.atu.lab4_cicd;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotBlank(message = "You must enter a name.")
    private String name;
    @NotBlank(message = "You must enter a title")
    private String title;
    @Email(message = "Not a valid email address")
    private String email;
    @NotBlank(message = "Not a position")
    private String position;
    @NotBlank(message = "Not a department")
    private String department;
    @Min(value = 0, message = "Age must be greater or equal to 0")
    private int age;
    @Min(value = 1, message = "Must be greater or equal to 1")
    private int employeeId;
}
