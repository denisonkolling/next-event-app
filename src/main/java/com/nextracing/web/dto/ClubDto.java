package com.nextracing.web.dto;

import com.nextracing.web.models.User;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ClubDto {
    private Long id;
    @NotEmpty(message = "Club content should not be empty")
    private String title;
    @NotEmpty(message = "Club content should not be empty")
    private String photoUrl;
    @NotEmpty(message = "Club content should not be empty")
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private User createdBy;
    private List<EventDto> events;
}
