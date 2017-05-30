package sg.edu.rp.c346.fypaircontroller;

/**
 * Created by 15017452 on 30/5/2017.
 */

public class User {
    public String role;
    public String name;

    public User(String role, String name) {
        this.role = role;
        this.name = name;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
