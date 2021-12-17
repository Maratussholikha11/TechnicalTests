package org.javajarvis.TechnicalTests.repository;

import org.javajarvis.TechnicalTests.model.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepository extends JpaRepository<Shopping, Integer> {

}
