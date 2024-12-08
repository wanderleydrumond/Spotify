package com.drumond.backend.usercontext.domain;

/**
 * DTO for {@link User}
 */
public record ReadUserDTO(String firstName, String lastName, String email, String imageUrl) {
}