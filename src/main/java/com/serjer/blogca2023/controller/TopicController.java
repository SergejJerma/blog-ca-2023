package com.serjer.blogca2023.controller;

import com.serjer.blogca2023.entity.Comment;
import com.serjer.blogca2023.entity.Topic;
import com.serjer.blogca2023.repo.CommentRepository;
import com.serjer.blogca2023.service.CommentService;
import com.serjer.blogca2023.service.TopicService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @Autowired
    private CommentService commentService;

    @GetMapping
    public String getTopics(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("topics", topics);
        return "topics";
    }
    @GetMapping("/{id}")
    public String getTopic(@PathVariable Long id,  Model model) {
        model.addAttribute("id", id);
        model.addAttribute("comment", new Comment());

        Topic topic = topicService.getTopic(id);
        model.addAttribute("topic", topic);
        return "topic";
    }

    @PostMapping("/{id}")
    public String addCommentToTopic(@PathVariable Long id, Comment comment, Model model) {
        Topic topic = topicService.getTopic(id);
        comment.setTopic(topic);
        commentService.addCommentToTopic(comment);
        return "redirect:/topics/" + id;
    }


    @GetMapping("/add")
    public String getAddTopicForm(Model model) {
        model.addAttribute("newTopic", new Topic());
        return "addTopic";
    }

    @PostMapping
    public String postTopics(Topic newTopic, Model model) {
        topicService.addNewTopic(newTopic);
        return "redirect:/topics";
    }

    @GetMapping("/filter")
    public String filterTopics(@RequestParam String keyword, Model model) {
        System.out.println("KEYWORD" + keyword);
        List<Topic> topics = topicService.filterTopicsByKeyword(keyword);
        model.addAttribute("topics", topics);
        return "topics";
    }

}
