package com.example.alfresco.controller;

import com.example.alfresco.dto.AlfrescoDTO;
import com.example.alfresco.service.AlfrescoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AlfrescoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AlfrescoController.class);

    @Autowired
    AlfrescoService alfrescoService;

    @GetMapping("/fizzbuzz")
    public ResponseEntity<AlfrescoDTO> getResponse(@RequestBody String alfrescoRequestBody) {
        return new ResponseEntity<>(alfrescoService.getResponse(alfrescoRequestBody), HttpStatus.OK);
    }

}
