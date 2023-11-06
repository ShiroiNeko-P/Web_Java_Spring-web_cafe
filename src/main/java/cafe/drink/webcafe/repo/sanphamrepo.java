package cafe.drink.webcafe.repo;

import cafe.drink.webcafe.models.sanpham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sanphamrepo extends JpaRepository<sanpham, Integer> {

}
