package uz.swagger.swagger_config.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Botirov Najmiddin, Thu 2:55 PM. 9/1/2022
 */
@RestController
@RequestMapping("/api/")
public class Controller {

    @GetMapping("get")
    public ResponseEntity<String> getData() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
