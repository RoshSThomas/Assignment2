package com.ContactManagement.System.ContactManagement.Controller;


import com.ContactManagement.System.ContactManagement.Entity.PersonDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class PersonController {
    @GetMapping("/person")
    public List<PersonDetails> getAllPerson(){
        return  Arrays.asList (new PersonDetails(1,"rosh","thoppil puthen veedu",91,2233l,"roshsthomas"));
    }

//    @PostMapping("/personn")
//    public List<PersonDetails> getAllPersonn(){
//        return  Arrays.asList (new PersonDetails(1,"rosh","thoppil puthen veedu",91,2233l,"roshsthomas"));
//    }

}
