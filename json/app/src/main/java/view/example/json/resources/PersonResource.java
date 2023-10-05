package view.example.json.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import view.example.json.daos.PersonDao;
import view.example.json.models.Person;
import view.example.json.views.PersonView;

@Path("/people/{id}")
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

  private final PersonDao dao;

  public PersonResource(PersonDao dao) {
    this.dao = dao;
  }

  @GET
  public PersonView getPerson(@PathParam("id") long id) {
    return new PersonView(dao.find(id).orElse(new Person("null; stranger")));
  }
}
