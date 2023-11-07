package org.radios.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Satya
 * @created 9/1/2023 - 2:53 PM
 **/
public class RadiosContentDto {
    @JsonProperty("items")
    private List<RadiosItemDto> items;
    @JsonProperty("itemsType")
    private String itemsType;
    @JsonProperty("title")
    private String title;
    @JsonProperty("type")
    private String type;
}
