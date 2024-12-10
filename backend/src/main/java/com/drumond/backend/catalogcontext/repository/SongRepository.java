package com.drumond.backend.catalogcontext.repository;

import com.drumond.backend.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
  }