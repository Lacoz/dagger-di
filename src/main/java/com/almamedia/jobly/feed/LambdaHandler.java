package com.almamedia.jobly.feed;

import com.almamedia.jobly.common.CommonProvider;
import dagger.Component;

import javax.inject.Singleton;

public class LambdaHandler {

    @Singleton
    @Component(
            modules=CommonProvider.class
    )
    public interface Handler {
        Entrypoint entrypoint();
    }
    public static void main(String[] args){
        Handler handler = DaggerLambdaHandler_Handler.builder().build();
        handler.entrypoint().run();
    }
}
