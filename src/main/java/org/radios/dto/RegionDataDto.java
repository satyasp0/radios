package org.radios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Satya
 * @created 02/09/2023 - 16:18
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class RegionDataDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
}
