package com.galvanize.muzicshare.repository;

import com.galvanize.muzicshare.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

    @Query("SELECT p FROM Playlist p where p.name = ?1")
    Optional<Playlist> findByName(String name);
}
