package ru.kpfu.itis.pollproject.model;

public class Option {
    private int id;
    private String optionText;

    public Option() {
    }

    public Option(int id, String optionText) {
        this.id = id;
        this.optionText = optionText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}
