package com.drumond.backend.usercontext.domain;

import com.drumond.backend.sharedkernel.domain.AbstractAuditingEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "spotify_user")
public class User extends AbstractAuditingEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequenceGenerator")
    @SequenceGenerator(name = "userSequenceGenerator", sequenceName = "user_generator", allocationSize = 1)
    @Column(nullable = false)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @Column(name = "image_url")
    private String imageUrl;
    private Subscription subscription = Subscription.FREE;
    private String createdDate;

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public Long getId() {
        return 0L;
    }
}