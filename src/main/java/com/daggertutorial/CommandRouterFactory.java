package com.daggertutorial;

import dagger.Component;

@Component(modules = HelloWorldModule.class)
public interface CommandRouterFactory {
    CommandRouter router();
}
