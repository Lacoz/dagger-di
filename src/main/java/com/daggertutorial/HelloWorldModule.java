package com.daggertutorial;

import dagger.Module;
import dagger.Binds;

@Module
abstract class HelloWorldModule {
    @Binds
    abstract Command helloWorldCommand(HelloWorldCommand command);
}
