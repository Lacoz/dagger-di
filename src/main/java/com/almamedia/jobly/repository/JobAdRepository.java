package com.almamedia.jobly.repository;

import com.almamedia.jobly.records.JobAd;

import javax.inject.Inject;
import java.sql.Connection;
import java.util.ArrayList;

public class JobAdRepository {
    private final Connection connection;

    @Inject
    public JobAdRepository(Connection connection){
        this.connection = connection;
    }

    public ArrayList<JobAd> getRecords() {


        ArrayList<JobAd> records = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            records.add(new JobAd(
                    i,
                    "add nr " + i,
                    "My company",
                    "http://logo.url",
                    "2023-02-02",
                    "2033-01-02",
                    "Germany",
                    connection.toString()
            ));
        }

        return records;
    }
}
