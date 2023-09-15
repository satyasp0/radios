package org.radios.proxy;

import org.radios.dto.firstclass.PlacesResponseDto;
import org.radios.dto.fourthclass.RadiosDataDto;
import org.radios.dto.secondclass.ChannelDataDto;

import java.util.List;

/**
 * @author Satya
 * @created 8/24/2023 - 2:03 PM
 **/
public interface RadioGardenOpenApi {

    List<PlacesResponseDto> getAllPlaces();

    RadiosDataDto getPlacesDetailByID(String placeId);

    RadiosDataDto getChannelByPlaceId(String placeId);

    ChannelDataDto getChannelDetailByID(String channelId);


}
