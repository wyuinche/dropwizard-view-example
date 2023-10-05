package view.example.html.resources;

import jakarta.inject.Singleton;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;
import view.example.html.HtmlEgConfiguration;

public class PersonModule extends DropwizardAwareModule<HtmlEgConfiguration> {

  @Override
  protected void configure() {
    bind(PersonResource.class).toProvider(PersonConfigProvider.class).in(Singleton.class);
  }
}
