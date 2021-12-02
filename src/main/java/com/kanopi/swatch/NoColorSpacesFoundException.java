package com.kanopi.swatch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Authored by dushan.p@viewqwest.com on 30/11/21.
 * http://dushan.lk
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No Color Spaces found")
public class NoColorSpacesFoundException extends RuntimeException {
}
