package com.steam.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.steam.entity.Library;

public interface LibraryRepository extends JpaRepository<Library,Long>{

   @Query("""
    SELECT l
    FROM Library l
    WHERE l.user.id = :userId
    AND l.game.id = :gameId
""")
Optional<Library> findByUserIdAndGameId(@Param("userId") Long userId,@Param("gameId") Long gameId);

   @Query("""
        SELECT l
        FROM Library l
        WHERE l.user.id = :userId
    """)
    List<Library> findByUserId(@Param("userId") Long id);

    
}
