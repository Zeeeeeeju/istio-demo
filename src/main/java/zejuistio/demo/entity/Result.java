package zejuistio.demo.entity;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {

    private String version;
    private String desc;
    private List<User> users;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
