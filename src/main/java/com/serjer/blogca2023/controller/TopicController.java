package com.serjer.blogca2023.controller;

import com.serjer.blogca2023.entity.Topic;
import com.serjer.blogca2023.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping
    public String getTopics(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("topics", topics);
        return "topics";
    }
    @GetMapping("/{id}")
    public String getTopic(@PathVariable Long id,  Model model) {
        Topic topic = topicService.getTopic(id);
        model.addAttribute("topic", topic);
        return "topic";
    }


}
