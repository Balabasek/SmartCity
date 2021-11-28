package table;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="users")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Device> devices = new ArrayList<>();

    public User(){}

    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void addDevice(Device device){
        devices.add(device);
        device.setUser(this);
    }

    public void removeDevice(Device device){
        devices.remove(device);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", devices=" + devices +
                '}';
    }
}
