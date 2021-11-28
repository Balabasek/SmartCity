package table;

import javax.persistence.*;

@Entity
@Table
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String kind;
    @ManyToOne(fetch = FetchType.LAZY   )
    @JoinColumn(name="user_id")
    private User user;

    public Device(){

    }

    public Device(String kind){
        this.kind = kind;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", kind='" + kind + '\'' +
                ", user=" + user +
                '}';
    }

    public void setUser(User user) {
        this.user = user;
    }
}
