package ru.kpfu.itis.pollproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.kpfu.itis.pollproject.model.Option;
import ru.kpfu.itis.pollproject.model.Poll;

import java.util.List;

public class OptionDaoImpl implements OptionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Option> findAllByPoll(Poll poll) {
        Integer[] params = {poll.getId()};
        List<Option> options = jdbcTemplate
                .query("SELECT * FROM option WHERE poll_id = ?",
                        params,
                        new OptionRowMapper());
        return options;
    }
}
