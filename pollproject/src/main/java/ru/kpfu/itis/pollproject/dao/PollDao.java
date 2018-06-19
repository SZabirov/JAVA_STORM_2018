package ru.kpfu.itis.pollproject.dao;

import ru.kpfu.itis.pollproject.model.Poll;

import java.util.List;

public interface PollDao {
    List<Poll> findAll();
    Poll findById(int id);
}
