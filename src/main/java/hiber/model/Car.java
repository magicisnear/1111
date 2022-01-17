package hiber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
