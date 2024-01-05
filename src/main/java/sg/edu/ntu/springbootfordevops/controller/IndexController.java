package sg.edu.ntu.springbootfordevops.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping
public class IndexController {

    @GetMapping
    public ResponseEntity<String> allOk() {
        return ResponseEntity.ok("Application started properly");
    }
}
