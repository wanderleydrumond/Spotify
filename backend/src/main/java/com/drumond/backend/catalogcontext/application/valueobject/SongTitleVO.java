package com.drumond.backend.catalogcontext.application.valueobject;

import jakarta.validation.constraints.NotBlank;

public record SongTitleVO(@NotBlank String value) {
}
