package com.almamedia.jobly.common;

import dagger.Module;
import dagger.Provides;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.SQLException;

@Module
public class CommonProvider {
    @Provides
    public Dotenv provideDotenv(){
        return Dotenv.load();
    }
    @Provides
    public Connection provideConnection()  {
        try {
            return DBConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
