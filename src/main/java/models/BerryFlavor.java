package models;

public class BerryFlavor {

    private String name;
    private String url;

    public BerryFlavor(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public BerryFlavor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BerryFlavor{");
        sb.append("name='").append(name).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
