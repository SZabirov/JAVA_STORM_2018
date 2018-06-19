package ru.kpfu.itis.pollproject.dao;

import ru.kpfu.itis.pollproject.model.Option;
import ru.kpfu.itis.pollproject.model.Poll;

import java.util.List;

public interface OptionDao {
    List<Option> findAllByPoll(Poll poll);
}
