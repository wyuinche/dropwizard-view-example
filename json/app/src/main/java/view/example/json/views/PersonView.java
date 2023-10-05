package view.example.json.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import view.example.json.models.Person;

@AllArgsConstructor
@Data
public class PersonView {
  private Person person;
}
