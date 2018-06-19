package ru.kpfu.itis.pollproject.dao;


import org.springframework.jdbc.core.RowMapper;
import ru.kpfu.itis.pollproject.model.Poll;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PollRowMapper implements RowMapper<Poll> {
    @Override
    public Poll mapRow(ResultSet resultSet, int i) throws SQLException {
        Poll poll = new Poll();
        poll.setId(resultSet.getInt("id"));
        poll.setTitle(resultSet.getString("title"));
        return poll;
    }
}
