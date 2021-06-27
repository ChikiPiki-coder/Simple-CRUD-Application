package ru.webapp.tamik.dao;

import org.springframework.stereotype.Component;
import ru.webapp.tamik.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int inx;
    private List<Person> people;

    {
        people=new ArrayList<>();
        people.add(new Person(++inx,"Egor","Shkarin","Shkarin@mail.com"));
        people.add(new Person(++inx,"Mirza","Amrakhov","Amrakhov@mail.com"));
        people.add(new Person(++inx,"Tamik","Kozhiev","Kozhiev@mail.com"));
        people.add(new Person(++inx,"Nika","Ryabova","Ryabova@mail.com"));
    }

    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person->person.getId()==id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++inx);
        people.add(person);
    }

    public void update(int id,Person updatedPerson){
        Person personToBeUpdated=show(id);
        personToBeUpdated.setEmail(updatedPerson.getEmail());
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setLastName(updatedPerson.getLastName());
    }

    public void delete(int id){
        people.removeIf(p->p.getId()==id);
         inx--;
    }
}
