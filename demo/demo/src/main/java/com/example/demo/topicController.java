package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class topicController {

    private topicService topicservice = new topicService();

    @RequestMapping("/topics")
    public List<Topic> topic()
    {
        return topicservice.getalltopic();
    }
    @RequestMapping("/topics/{Id}")
    public Topic gettopic(@PathVariable String Id)
    {
        return topicservice.gettopic(Id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addtopic(@RequestBody Topic topic)
    {
        topicservice.addtopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/topics/{Id}")
    public void updatetopic(@RequestBody Topic topic, @PathVariable String Id)
    {
        topicservice.updatetopic(Id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{Id}")
    public void deletetopic(@PathVariable String Id)
    {
        topicservice.deletetopic(Id);
    }


}
