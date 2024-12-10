package com.drumond.backend.catalogcontext.repository;

import com.drumond.backend.catalogcontext.domain.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
}