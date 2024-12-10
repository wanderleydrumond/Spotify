package com.drumond.backend.catalogcontext.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "song_content")
public class SongContent implements Serializable {
    @Id
    @Column(name = "song_id", nullable = false)
    private Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "song_id", referencedColumnName = "id")
    private Song song;

    @Lob
    @Column(nullable = false)
    private byte[] file;

    @Column(name = "file_content_type", nullable = false)
    private String fileContentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
}