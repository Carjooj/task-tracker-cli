package model;
import enums.Status;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Task {
    private final UUID id = UUID.randomUUID();

    private String description;

    private Status status;

    private final Date createdAt = Date.from(Instant.now());

    private Date updatedAt;

    public Task() {

    }

    public Task(String description, Status status) {
        this.description = description;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
