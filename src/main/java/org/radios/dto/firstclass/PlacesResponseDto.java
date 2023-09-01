package org.radios.dto.firstclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Satya
 * @created 9/1/2023 - 2:04 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class PlacesResponseDto {
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("id")
    private String id;
    @JsonProperty("geo")
    private List<Float> geo;
    @JsonProperty("url")
    private String url;
    @JsonProperty("boost")
    private Boolean boost;
    @JsonProperty("title")
    private String title;
    @JsonProperty("country")
    private String country;
}
