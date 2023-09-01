package org.radios.app;

import org.radios.dto.firstclass.PlacesResponseDto;
import org.radios.dto.fourthclass.RadiosDataDto;
import org.radios.proxy.RadioGardenOpenApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Satya
 * @created 8/24/2023 - 1:54 PM
 **/

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/radio")
public class RadioGarden {
    private static final Logger log = LoggerFactory.getLogger(RadioGarden.class);
    private final RadioGardenOpenApi radioGardenOpenApi;

    @Autowired
    public RadioGarden(RadioGardenOpenApi radioGardenOpenApi) {
        this.radioGardenOpenApi = radioGardenOpenApi;
    }

    @GetMapping(value = "/all")
    ResponseEntity<List<PlacesResponseDto>> getAllRadios(){
        try{
            List<PlacesResponseDto> responseDto = radioGardenOpenApi.getAllPlaces();
            return ResponseEntity.ok(responseDto);
        }catch (Exception e){
            log.error("Error while trying to get all places : ", e);
        }
        return null;
    }

    @GetMapping(value = "/place/{placeId}")
    ResponseEntity<RadiosDataDto> getPlaceDetail(@PathVariable String placeId){
        RadiosDataDto responseDto = radioGardenOpenApi.getPlacesDetailByID(placeId);
        return ResponseEntity.ok(responseDto);
    }
}
