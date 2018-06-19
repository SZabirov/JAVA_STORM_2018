package ru.kpfu.itis.pollproject.model;

import java.util.List;

public class Poll {
    private int id;
    private String title;
    private List<Option> options;

    public Poll() {
    }

    public Poll(int id, String title, List<Option> options) {
        this.id = id;
        this.title = title;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
