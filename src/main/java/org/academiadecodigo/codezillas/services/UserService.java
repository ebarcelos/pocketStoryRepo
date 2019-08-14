package org.academiadecodigo.codezillas.services;

import org.academiadecodigo.codezillas.model.Story;
import org.academiadecodigo.codezillas.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<String, User> users;

    public Map<String, User> getUsers() {
        return users;
    }
    private UserService userController;

    public UserService(){
        init();
    }

    private void init() {
        users = new HashMap<>();
        User user = new User();
        user.setUsername("tiago");
        user.setNickname("Tiaguimm");
        user.setPassword("0000");
        Story story = new Story();
        story.setTitle("The duke's story");
        story.setText("You will find The Duke of Buckingham in Old Portsmouth, it is in the High Street and close to all the action.  The Duke of Buckingham also offers Bed and Breakfast, and not just for regulars who cannot make it home!\n" +
                "\n" +
                "Will did not need to tell me, I knew that he would be found mostly in the bar.");
        story.setRank(23);
        story.setAuthor(user.getNickname());
        Story[] stories = {story};
        user.setOwnStories(stories);


        User user1 = new User();
        user1.setUsername("Mox");
        user1.setNickname("BiggusDickus");
        user1.setPassword("111");

        User user2 = new User();
        user2.setUsername("Tomas");
        user2.setNickname("Marandi");
        user2.setPassword("000");

        users.put(user.getUsername(),user);
        users.put(user1.getUsername(),user1);
        users.put(user2.getUsername(),user2);
    }
}
