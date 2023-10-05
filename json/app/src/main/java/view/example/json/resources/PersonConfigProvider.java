package view.example.json.resources;

import jakarta.inject.Provider;
import view.example.json.daos.PersonDao;

public class PersonConfigProvider implements Provider<PersonResource> {

  @Override
  public PersonResource get() {
    return new PersonResource(new PersonDao());
  }
}
