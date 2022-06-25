package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class topicService {
   public List<Topic>topics = new ArrayList<>(Arrays.asList(
            new Topic("java","tazim","CSE student"),
                new Topic("spring","ajoy"," Cse student")
        ));

   public  List<Topic> getalltopic()
    {
        return topics;
    }
    public Topic gettopic(String Id)
    {
        return topics.stream().filter(topic -> topic.getId().equals(Id)).findFirst().get();

    }
    public void addtopic(Topic topic)
    {
        topics.add(topic);
    }

    public void updatetopic(String Id, Topic topic) {

       for(int i=0; i<topics.size(); i++)
       {
           Topic t = topics.get(i);
           if(t.getId().equals(Id))
           {
                topics.set(i,topic);
                return;
           }
       }
    }

    public void deletetopic(String Id) {
       topics.removeIf(topic -> topic.getId().equals(Id));
    }
}
