package org.radios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Satya
 * @created 02/09/2023 - 16:19
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class ChannelDataDto {
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("id")
    private String id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("website")
    private String website;
    @JsonProperty("secure")
    private Boolean secure;
    @JsonProperty("place")
    private RegionDataDto place;
    @JsonProperty("country")
    private RegionDataDto country;
}
