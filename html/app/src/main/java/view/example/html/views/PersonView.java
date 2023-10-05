package view.example.html.views;

import io.dropwizard.views.common.View;
import view.example.html.models.Person;

public class PersonView extends View {

  private final Person person;

  public PersonView(Person person) {
    super("person.ftl");
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }
}
