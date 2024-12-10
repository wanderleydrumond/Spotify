package com.drumond.backend.catalogcontext.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "favorite_song")
@IdClass(FavoriteId.class)
public class Favorite {
    @Id
    private UUID songPublicId;
    @Column(name = "user_email")
    private String userEmail;

    public String getUserEmail() {
        return userEmail;
    }
}