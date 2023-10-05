package view.example.json.resources;

import jakarta.inject.Singleton;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;
import view.example.json.JsonEgConfiguration;

public class PersonModule extends DropwizardAwareModule<JsonEgConfiguration> {

  @Override
  protected void configure() {
    bind(PersonResource.class).toProvider(PersonConfigProvider.class).in(Singleton.class);
  }
}
