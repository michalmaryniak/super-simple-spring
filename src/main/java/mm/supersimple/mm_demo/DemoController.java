package mm.supersimple.mm_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private int counter = 1;

    record Status(String text, int number){}

    @GetMapping("status")
    public ResponseEntity<Status> getStatus() {
        return ResponseEntity.ok(new Status("hello", counter++));
    }

}
