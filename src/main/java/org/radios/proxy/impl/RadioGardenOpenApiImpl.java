package org.radios.proxy.impl;

import org.radios.dto.AllPlaceResponseDto;
import org.radios.dto.firstclass.PlacesResponseDto;
import org.radios.dto.PlaceDetailResponseDto;
import org.radios.dto.fourthclass.RadiosDataDto;
import org.radios.dto.secondclass.AllPlaceDataResponseDto;
import org.radios.proxy.RadioGardenOpenApi;
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

    public RadioGardenOpenApiImpl() {
        this.restTemplate = new RestTemplate();
    }
    @Override
    public List<PlacesResponseDto> getAllPlaces() {
        URI url = URI.create(SERVER+"/ara/content/places");
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<AllPlaceResponseDto> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, AllPlaceResponseDto.class);

        return Optional.ofNullable(responseEntity.getBody())
                .map(AllPlaceResponseDto::getData)
                .map(AllPlaceDataResponseDto::getList)
                .orElse(Collections.emptyList());
    }

    @Override
    public RadiosDataDto getPlacesDetailByID(String placeId) {
        URI url = URI.create(SERVER+"/ara/content/page/"+placeId);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<PlaceDetailResponseDto> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, PlaceDetailResponseDto.class);

        return Optional.ofNullable(responseEntity.getBody())
                .map(PlaceDetailResponseDto::getData)
                .orElse(null);
    }
}
