package org.radios.dto.fourthclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.radios.dto.thirdclass.RadiosContentDto;

import java.util.List;

/**
 * @author Satya
 * @created 9/1/2023 - 2:52 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class RadiosDataDto {
    @JsonProperty("type")
    private String type;
    @JsonProperty("count")
    private int count;
    @JsonProperty("map")
    private String map;
    @JsonProperty("title")
    private String title;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("url")
    private String url;
    @JsonProperty("utcOffset")
    private int utcOffset;
    @JsonProperty("content")
    private List<RadiosContentDto> content;
}
