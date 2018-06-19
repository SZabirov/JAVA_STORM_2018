package ru.kpfu.itis.pollproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.kpfu.itis.pollproject.dao.PollDao;
import ru.kpfu.itis.pollproject.model.Poll;

import java.util.List;

@Controller
public class PollController {
    @Autowired
    PollDao pollDao;

    @GetMapping("/polls")
    String polls(Model model) {
        List<Poll> polls = pollDao.findAll();
        model.addAttribute("polls", polls);
        return "polls";
    }

    @GetMapping("/polls/{id}")
    String getPoll(@PathVariable int id, Model model) {
        return null;
    }
}
