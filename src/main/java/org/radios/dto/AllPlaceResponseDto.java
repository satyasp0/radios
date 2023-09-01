package org.radios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.radios.dto.secondclass.AllPlaceDataResponseDto;

/**
 * @author Satya
 * @created 9/1/2023 - 3:50 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class AllPlaceResponseDto {
    @JsonProperty("apiVersion")
    private int apiVersion;
    @JsonProperty("version")
    private String version;
    @JsonProperty("data")
    private AllPlaceDataResponseDto data;

}
