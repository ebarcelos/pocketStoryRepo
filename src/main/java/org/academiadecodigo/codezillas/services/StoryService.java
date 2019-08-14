package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Story;
import org.academiadecodigo.codezillas.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StoryService {

    private Map<String, Story> stories;

    public Map<String, Story> getStories() {
        return stories;
    }

    public StoryService(){
        init();
    }

    private void init() {
        stories = new HashMap<>();

        Story story = new Story();

        story.setTitle("Saint oh saint...");
        story.setAuthor("Tiaguimm");
        story.setRank(69);
        story.setText("Hi there! So my girlfriend and I decided to go see the Saint do Facho at night. Things got funny and we took longer than expected. Thing is, we forgot to turn off the car lights...\n" +
                "Got stuck there for 3 hours trying to push the car and getting it to work. After all that time, we decided to call the cops for some help. They thought it was just a stupid prank and we had to call 3 more times and wait 2 more hours for them!\n" +
                "After almost 6 hours of panic, they got there and in 5 minutes got the car to work and told us \"next time, get a room!\". Best ride ever.");

        Story story1 = new Story();

        story1.setTitle("Cockroach Figueirinhas");
        story1.setAuthor("Cockroach Master");
        story1.setRank(24);
        story1.setText("So here is what went down, after a long night of parting with all my friends, we needed to get some food and what better place than the 'amazing figueirinhas' everyone talked about. We got there and ordered, while we waited, a cockroach went up my friends leg! You should see her face! Everyone fliped out and all she could do was jump and scream!\n" +
                "It was way too god damn good!");


        stories.put(story.getTitle(),story);
        stories.put(story1.getTitle(),story1);
    }

}
