package org.radios.dto.firstclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Satya
 * @created 9/1/2023 - 2:55 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class RadiosPageDto {

        @JsonProperty("map")
        private String map;
        @JsonProperty("url")
        private String url;
        @JsonProperty("type")
        private String type;
        @JsonProperty("count")
        private int count;
        @JsonProperty("title")
        private String title;
        @JsonProperty("subtitle")
        private String subtitle;

}
