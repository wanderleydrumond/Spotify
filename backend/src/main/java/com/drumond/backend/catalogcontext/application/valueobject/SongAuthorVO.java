package com.drumond.backend.catalogcontext.application.valueobject;

import jakarta.validation.constraints.NotBlank;

public record SongAuthorVO(@NotBlank String value) {
}