package com.drumond.backend.catalogcontext.application.dto;

import com.drumond.backend.catalogcontext.application.valueobject.SongAuthorVO;
import com.drumond.backend.catalogcontext.application.valueobject.SongTitleVO;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class ReadSongInformationDTO {
    private SongTitleVO title;

    private SongAuthorVO author;

    @NotNull
    private byte[] cover;

    @NotNull
    private String coverContentType;

    private boolean isFavorite;

    @NotNull
    private UUID publicId;

    public SongAuthorVO getAuthor() {
        return author;
    }

    public void setAuthor(SongAuthorVO author) {
        this.author = author;
    }

    public SongTitleVO getTitle() {
        return title;
    }

    public void setTitle(SongTitleVO title) {
        this.title = title;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public String getCoverContentType() {
        return coverContentType;
    }

    public void setCoverContentType(String coverContentType) {
        this.coverContentType = coverContentType;
    }
}