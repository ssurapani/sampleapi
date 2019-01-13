package com.figroup.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        /** return Arrays.asList(
                new Topic("spring", "spring framework", "spring description"),
                new Topic("java", "java framework", "java description"),
                new Topic("java script", "JS framework", "JS description")
        ); */

        return topicService.getTopics();

    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }
}
