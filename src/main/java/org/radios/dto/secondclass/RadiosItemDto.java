package org.radios.dto.secondclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.radios.dto.firstclass.RadiosPageDto;

/**
 * @author Satya
 * @created 9/1/2023 - 2:55 PM
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class RadiosItemDto {
        @JsonProperty("href")
        private String href;
        @JsonProperty("title")
        private String title;
        @JsonProperty("subtitle")
        private String subtitle;
        @JsonProperty("map")
        private String map;
        @JsonProperty("rightAccessory")
        private String rightAccessory;
        @JsonProperty("leftAccessory")
        private String leftAccessory;
        @JsonProperty("leftAccessoryCount")
        private int leftAccessoryCount;
        @JsonProperty("rightDetail")
        private String rightDetail;
        @JsonProperty("page")
        private RadiosPageDto page;
}
