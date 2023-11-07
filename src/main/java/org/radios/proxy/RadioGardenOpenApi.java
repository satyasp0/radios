package org.radios.proxy;

import org.radios.dto.*;

import java.util.List;

/**
 * @author Satya
 * @created 8/24/2023 - 2:03 PM
 **/
public interface RadioGardenOpenApi {

    List<PlaceDataDto> getAllPlaces();

    RadiosDataDto getPlacesDetailByID(String placeId);

    RadiosDataDto getChannelByPlaceId(String placeId);

    ChannelDataDto getChannelDetailByID(String channelId);


}
