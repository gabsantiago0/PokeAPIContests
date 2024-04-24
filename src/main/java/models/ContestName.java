package models;

public class ContestName {

    private String name;
    private String color;
    private Language language;

    public ContestName(String name, String color, Language language) {
        this.name = name;
        this.color = color;
        this.language = language;
    }

    public ContestName() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", language=").append(language);
        sb.append('}');
        return sb.toString();
    }
}
