package com.nextracing.web.repository;

import com.nextracing.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {

    Optional<Club> findByTitle(String url);
    @Query("SELECT c from Club c WHERE c.title ILIKE CONCAT('%', :query, '%')")
    List<Club> searchClubs(String query);

}
