package ie.atu.lab4_cicd;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person> personList = new ArrayList<>();
    @GetMapping("/getPeople")
    public List<Person> getPerson()
    {
        return personList;
    }

    @PostMapping("/addPerson")
    public List<Person> addProduct(@Valid @RequestBody Person person)
    {
        personList.add(person);
        return personList;
    }
}
