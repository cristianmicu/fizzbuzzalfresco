package com.example.alfresco.service;

import com.example.alfresco.dto.AlfrescoDTO;
import com.example.alfresco.helper.AlfrescoHelper;
import com.example.alfresco.mapper.AlfrescoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlfrescoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AlfrescoService.class);

    @Autowired
    AlfrescoMapper alfrescoMapper;

    public AlfrescoDTO getResponse(String requestBodyString) {

        List<String> result = AlfrescoHelper.rangeTransformer(alfrescoMapper.stringToList(requestBodyString));

        return new AlfrescoDTO(result);
    }
}
