package com.cognizant.orm.learn.Repository;

import org.springframework.data.jpa.repository.JpaRepository; // [cite: 656]
import org.springframework.stereotype.Repository; // [cite: 657]
import com.cognizant.orm.learn.model.Country; // [cite: 658]

@Repository // [cite: 655, 659]
public interface CountryRepository extends JpaRepository<Country, String> { // [cite: 660]
}