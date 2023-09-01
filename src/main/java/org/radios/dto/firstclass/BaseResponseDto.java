package org.radios.dto.firstclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Satya
 * @created 8/24/2023 - 1:59 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class BaseResponseDto {
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("massage")
    private String massage;
}
