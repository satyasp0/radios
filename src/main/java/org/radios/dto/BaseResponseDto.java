package org.radios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Satya
 * @created 02/09/2023 - 16:40
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class BaseResponseDto {
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private Object data;
}
