package org.academiadecodigo.codezillas;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class PocketStory implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        String[] profiles = contextRefreshedEvent.getApplicationContext().getEnvironment().getActiveProfiles();

        System.out.println("#### Active Profiles: ####");
        for (String profile : profiles) {
            System.out.println("=> " + profile);
        }

    }

}
