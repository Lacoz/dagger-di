package com.almamedia.jobly.feed;

import com.almamedia.jobly.records.JobAd;
import com.almamedia.jobly.repository.JobAdRepository;

import javax.inject.Inject;

public class Entrypoint {
    private final JobAdRepository jobAdRepository;
    @Inject
    public Entrypoint(JobAdRepository jobAdRepository){
        this.jobAdRepository = jobAdRepository;
    }
    public void run(){
        for (JobAd add : this.jobAdRepository.getRecords()) {
            System.out.println("run "+add.locationCity());
        }
    }
}
