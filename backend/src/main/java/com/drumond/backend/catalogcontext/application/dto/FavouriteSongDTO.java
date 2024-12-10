package com.drumond.backend.catalogcontext.application.dto;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record FavouriteSongDTO(boolean isFavourite, @NotNull UUID publicId) {
}
