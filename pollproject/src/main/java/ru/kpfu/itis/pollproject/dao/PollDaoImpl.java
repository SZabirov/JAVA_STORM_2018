package ru.kpfu.itis.pollproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.pollproject.model.Poll;

import java.util.List;

@Component
public class PollDaoImpl implements PollDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Poll> findAll() {
        return jdbcTemplate.query("SELECT * FROM poll",
                new PollRowMapper());
    }

    @Override
    public Poll findById(int id) {
        return null;
    }
}
