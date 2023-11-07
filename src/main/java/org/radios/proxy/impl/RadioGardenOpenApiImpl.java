package org.radios.proxy.impl;

import org.radios.dto.*;
import org.radios.proxy.RadioGardenOpenApi;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author Satya
 * @created 8/24/2023 - 2:03 PM
 **/

@Service
public class RadioGardenOpenApiImpl implements RadioGardenOpenApi {

    private final RestTemplate restTemplate;
    private static final String SERVER = "https://radio.garden/api";

    HttpEntity<String> requestEntity = new HttpEntity<>(new HttpHeaders());

    public RadioGardenOpenApiImpl() {
        this.restTemplate = new RestTemplate();
    }
    @Override
    public List<PlaceDataDto> getAllPlaces() {
        URI url = URI.create(SERVER+"/ara/content/places");
        ResponseEntity<BasicRadioGardenResponse<PlaceListResponseDto>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {});

        return Optional.ofNullable(responseEntity.getBody())
                .map(BasicRadioGardenResponse::getData)
                .map(PlaceListResponseDto::getList)
                .orElse(Collections.emptyList());
    }

    @Override
    public RadiosDataDto getPlacesDetailByID(String placeId) {
        ResponseEntity<BasicRadioGardenResponse<RadiosDataDto>> responseEntity = restTemplate.exchange(URI.create(SERVER+"/ara/content/page/"+placeId), HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {});

        return Optional.ofNullable(responseEntity.getBody())
                .map(BasicRadioGardenResponse::getData)
                .orElse(null);
    }

    @Override
    public RadiosDataDto getChannelByPlaceId(String placeId) {
        ResponseEntity<BasicRadioGardenResponse<RadiosDataDto>> responseEntity = restTemplate.exchange(
                URI.create(SERVER+"/ara/content/page/"+placeId+"/channels"),
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<>() {}
        );

        return Optional.ofNullable(responseEntity.getBody())
                .map(BasicRadioGardenResponse::getData)
                .orElse(null);
    }

    @Override
    public ChannelDataDto getChannelDetailByID(String channelId) {
        URI url = URI.create(SERVER+"/ara/content/channel/"+channelId);
        ResponseEntity<BasicRadioGardenResponse<ChannelDataDto>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {});

        return Optional.ofNullable(responseEntity.getBody())
                .map(BasicRadioGardenResponse::getData)
                .orElse(null);
    }
}
