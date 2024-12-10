package com.drumond.backend.catalogcontext.repository;

import com.drumond.backend.catalogcontext.domain.Favorite;
import com.drumond.backend.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}