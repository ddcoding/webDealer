package pl.ddweb.dealer.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.ddweb.dealer.domain.Car;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Car entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Page<Car> findAllByReceived(Boolean received, Pageable pageable);
}