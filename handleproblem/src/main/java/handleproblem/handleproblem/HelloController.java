package handleproblem.handleproblem;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> hello () {
        return new ResponseEntity<>("Why this is showing only in HTTP???", HttpStatus.OK);
    }

}
