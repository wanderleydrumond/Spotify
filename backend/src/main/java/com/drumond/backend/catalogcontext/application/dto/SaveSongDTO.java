package com.drumond.backend.catalogcontext.application.dto;

import com.drumond.backend.catalogcontext.application.valueobject.SongAuthorVO;
import com.drumond.backend.catalogcontext.application.valueobject.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(@Valid SongTitleVO songTitleVO,
                          @Valid SongAuthorVO songAuthorVO,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}