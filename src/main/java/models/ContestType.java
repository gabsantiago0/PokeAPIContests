package models;

import java.util.List;

public class ContestType {

    private Integer id;
    private String name;
    private BerryFlavor berry_flavor;
    private List<ContestName> names;

    public ContestType(Integer id, String name, BerryFlavor berry_flavor, List<ContestName> names) {
        this.id = id;
        this.name = name;
        this.berry_flavor = berry_flavor;
        this.names = names;
    }

    public ContestType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BerryFlavor getBerry_flavor() {
        return berry_flavor;
    }

    public void setBerry_flavor(BerryFlavor berry_flavor) {
        this.berry_flavor = berry_flavor;
    }

    public List<ContestName> getNames() {
        return names;
    }

    public void setNames(List<ContestName> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContestType{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", berry_flavor=").append(berry_flavor);
        sb.append(", names=").append(names);
        sb.append('}');
        return sb.toString();
    }
}
