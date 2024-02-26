package com.app.gymnagement.payload;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class PostDto {

    private int id;
    @NotEmpty
    private String name;
}
