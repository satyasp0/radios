package org.radios.app;

import org.radios.BaseHandler;
import org.radios.dto.BaseResponseDto;
import org.radios.dto.firstclass.PlacesResponseDto;
import org.radios.dto.fourthclass.RadiosDataDto;
import org.radios.dto.secondclass.ChannelDataDto;
import org.radios.proxy.RadioGardenOpenApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


/**
 * @author Satya
 * @created 8/24/2023 - 1:54 PM
 **/

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/radio")
public class RadioGarden extends BaseHandler {
    private static final Logger log = LoggerFactory.getLogger(RadioGarden.class);
    private final RadioGardenOpenApi radioGardenOpenApi;

    @Autowired
    public RadioGarden(RadioGardenOpenApi radioGardenOpenApi) {
        this.radioGardenOpenApi = radioGardenOpenApi;
    }

    @GetMapping(value = "/all")
    ResponseEntity<BaseResponseDto> getAllRadios(){
        try{
            List<PlacesResponseDto> responseDto = radioGardenOpenApi.getAllPlaces();
            if(Objects.nonNull(responseDto)){
                return send200(responseDto);
            }
            return send404();
        }catch (Exception e){
            log.error("Error while trying to get all places : ", e);
        }
        return send500();
    }

    @GetMapping(value = "/place/{placeId}")
    ResponseEntity<BaseResponseDto> getPlaceDetail(@PathVariable String placeId){
        try {
            RadiosDataDto responseDto = radioGardenOpenApi.getPlacesDetailByID(placeId);
            if(Objects.nonNull(responseDto)){
                return send200(responseDto);
            }
            return send404();
        }catch (Exception e){
            log.error("Error while trying to get place detail : ", e);
        }
        return send500();
    }

    @GetMapping(value = "/{placeId}/all")
    ResponseEntity<BaseResponseDto> getChannelsByPlaceId(@PathVariable String placeId){
        try {
            RadiosDataDto responseDto = radioGardenOpenApi.getChannelByPlaceId(placeId);
            if(Objects.nonNull(responseDto)){
                return send200(responseDto);
            }
            return send404();
        }catch (Exception e){
            log.error("Error while trying to get all channel in place : ", e);
        }
        return send500();
    }

    @GetMapping(value = "/channelDetail/{channelId}")
    ResponseEntity<BaseResponseDto> getChannelDetail(@PathVariable String channelId){
        try {
            ChannelDataDto responseDto = radioGardenOpenApi.getChannelDetailByID(channelId);
            if(Objects.nonNull(responseDto)){
                return send200(responseDto);
            }
            return send404();
        }catch (Exception e){
            log.error("Error while trying to get channel detail : ", e);
        }
        return send500();
    }
}
