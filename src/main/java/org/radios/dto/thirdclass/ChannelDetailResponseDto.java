package org.radios.dto.thirdclass;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.radios.dto.secondclass.ChannelDataDto;

/**
 * @author Satya
 * @created 02/09/2023 - 16:22
 **/
@Data
@SuperBuilder
@NoArgsConstructor
public class ChannelDetailResponseDto {
    @JsonProperty("apiVersion")
    private int apiVersion;
    @JsonProperty("version")
    private String version;
    @JsonProperty("data")
    private ChannelDataDto data;

}
