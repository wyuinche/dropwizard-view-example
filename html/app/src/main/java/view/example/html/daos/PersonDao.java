package view.example.html.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import view.example.html.libs.Dao;
import view.example.html.models.Person;

public class PersonDao implements Dao<Person> {

  private List<Person> people = new ArrayList<>();

  public PersonDao() {
    people.add(new Person("person1"));
    people.add(new Person("person2"));
  }

  @Override
  public Optional<Person> find(long id) {
    return Optional.ofNullable(people.get((int) id));
  }

  @Override
  public List<Person> getAll() {
    return people;
  }

  @Override
  public void save(Person person) {
    people.add(person);
  }

  @Override
  public void update(Person person, String name) {
    person.setName(Objects.requireNonNull(
        name, "null name"
    ));

    people.add(person);
  }

  @Override
  public void delete(Person person) {
    people.remove(person);
  }
}
