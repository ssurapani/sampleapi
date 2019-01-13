package com.figroup.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring framework", "spring description"),
            new Topic("java", "java framework", "java description"),
            new Topic("java script", "JS framework", "JS description")
    ));

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topics.get(1);
    }

    public void addTopic(Topic topic){
        // topicService.addTopic(topic);
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic){
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

}
