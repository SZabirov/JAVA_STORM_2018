package ru.kpfu.itis.pollproject.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.kpfu.itis.pollproject.model.Option;

import java.sql.ResultSet;
import java.sql.SQLException;


public class OptionRowMapper implements RowMapper<Option> {
    @Override
    public Option mapRow(ResultSet resultSet, int i) throws SQLException {
        Option o = new Option();
        o.setId(resultSet.getInt("id"));
        o.setOptionText(resultSet.getString("option_text"));
        return o;
    }
}
