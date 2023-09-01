package org.radios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.radios.dto.fourthclass.RadiosDataDto;
/**
 * @author Satya
 * @created 9/1/2023 - 2:51 PM
 **/

@Data
@SuperBuilder
@NoArgsConstructor
public class PlaceDetailResponseDto {
    @JsonProperty("apiVersion")
    private int apiVersion;
    @JsonProperty("version")
    private String version;
    @JsonProperty("data")
    private RadiosDataDto data;
}
