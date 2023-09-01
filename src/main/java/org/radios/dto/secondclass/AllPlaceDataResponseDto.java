package org.radios.dto.secondclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.radios.dto.firstclass.PlacesResponseDto;

import java.util.List;

/**
 * @author Satya
 * @created 9/1/2023 - 3:52 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class AllPlaceDataResponseDto {
    @JsonProperty("list")
    private List<PlacesResponseDto> list;
    @JsonProperty("version")
    private String version;
}
