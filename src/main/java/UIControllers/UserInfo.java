package UIControllers;

public class UserInfo {
    private final String id;
    private String name;

    public UserInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserInfo() {
        this.id = "";
        this.name = "";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

