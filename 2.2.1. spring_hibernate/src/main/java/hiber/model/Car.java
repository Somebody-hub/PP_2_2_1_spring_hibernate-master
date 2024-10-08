package hiber.model;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Car () {}

    public Car (String model, int series) {
        this.model = model;
        this.series = series;

    }

    public Long getId() {
        return this.id;
    }
    public void setId (Long id) {
        this.id = id;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public int getSeries() {
        return this.series;
    }
    public void setSeries (int series) {
        this.series = series;
    }
    public User getUser() {
        return this.user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return this.model + " " +this.series;
    }
}
