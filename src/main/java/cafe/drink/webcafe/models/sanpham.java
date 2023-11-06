package cafe.drink.webcafe.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="sanpham")
public class sanpham {
    @Column(name="ten")
    private String ten;
    @Column(name="id")
    @Id
    private int id;
}
