package org.radios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Satya
 * @created 9/1/2023 - 3:52 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class PlaceListResponseDto {
    @JsonProperty("list")
    private List<PlaceDataDto> list;
    @JsonProperty("version")
    private String version;
}
