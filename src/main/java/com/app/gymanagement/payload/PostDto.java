package com.app.gymanagement.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Schema(
        description = "AddUserDto Model Information"
)
public class PostDto {

    private int id;
    @Schema(
            description = "User name"
    )
    @NotEmpty
    private String name;
}
