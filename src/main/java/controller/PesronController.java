package controller;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonService;

import java.util.Hashtable;

/**
 * Created by Admin on 7/1/2016.
 */
@RestController
@RequestMapping("/persons")
public class PesronController {
    @Autowired
    PersonService ps;

    @RequestMapping("/all")
    public Hashtable<String, Person> getAll(){

        return ps.getAll();
    }
    @RequestMapping("{id}")
    public Person getPerson(@PathVariable("id") String id){

        return ps.getPerson(id);
    }
}
