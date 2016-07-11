package service;

import model.Person;
import org.springframework.stereotype.Service;


import java.util.Hashtable;

/**
 * Created by Admin on 7/1/2016.
 */
@Service

public class PersonService {
    Hashtable<String, Person> persons=new Hashtable<String,Person>();
    public PersonService(){
        Person p=new Person();
        p.setId("1");
        p.setFirstname("phani");
        p.setLastname("kumar");
        p.setAge(29);
        persons.put("1",p);

        p=new Person();
        p.setId("2");
        p.setFirstname("vineeth");
        p.setLastname("puli");
        p.setAge(28);
        persons.put("2",p);
    }
    public Person getPerson(String id){
        if(persons.containsKey(id))
        return persons.get(id);
        else
            return null;
    }
    public Hashtable<String,Person> getAll(){
        return persons;
    }
}
