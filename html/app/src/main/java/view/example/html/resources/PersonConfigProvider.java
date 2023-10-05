package view.example.html.resources;

import jakarta.inject.Provider;
import view.example.html.daos.PersonDao;

public class PersonConfigProvider implements Provider<PersonResource> {

  @Override
  public PersonResource get() {
    return new PersonResource(new PersonDao());
  }
}
