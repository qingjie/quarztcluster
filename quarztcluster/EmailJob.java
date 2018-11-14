package com.zhao.quarztcluster;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;

public class EmailJob implements Job {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        LOGGER.info("Start sending emails out...");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("Finish sending emails out...");

    }
}
