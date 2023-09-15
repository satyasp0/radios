package org.radios;

import org.radios.dto.BaseResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @author Satya
 * @created 02/09/2023 - 16:39
 **/
public abstract class BaseHandler {
    protected ResponseEntity<BaseResponseDto> send200(Object data) {
        return ResponseEntity.ok(BaseResponseDto.builder()
                .status(200)
                .message("SUCCESS")
                .data(data)
                .build());
    }

    protected ResponseEntity<BaseResponseDto> send404() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(BaseResponseDto.builder()
                .status(404)
                .message(String.valueOf(HttpStatus.NOT_FOUND))
                .data(null)
                .build());
    }

    protected ResponseEntity<BaseResponseDto> send500() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(BaseResponseDto.builder()
                .status(500)
                .message("SOMETHING WENT WRONG")
                .data(null)
                .build());
    }
}
