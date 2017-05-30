package sg.edu.rp.c346.fypaircontroller;

/**
 * Created by 15017452 on 30/5/2017.
 */

public class Gate {
    private String gate;
    private String message;
    private String username;
    private String password;

    public Gate(String gate, String message, String username, String password) {
        this.gate = gate;
        this.message = message;
        this.username = username;
        this.password = password;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
