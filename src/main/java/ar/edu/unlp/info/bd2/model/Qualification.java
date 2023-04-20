package ar.edu.unlp.info.bd2.model;

import javax.persistence.*;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "qualifications")
public class Qualification {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private float score; //De 1 a 5 estrellas

    @Column(length = 100)
    private String commentary;

    @OneToOne(fetch = LAZY, optional = false)
    @JoinColumn(name = "order_id")
    private Order order;

    public Qualification() {}

    public Qualification(float score, String commentary, Order order) {
        this.score = score;
        this.commentary = commentary;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
