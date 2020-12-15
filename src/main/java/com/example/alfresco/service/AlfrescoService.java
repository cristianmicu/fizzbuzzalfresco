package com.example.alfresco.service;

import com.example.alfresco.dto.AlfrescoDTO;
import com.example.alfresco.helper.AlfrescoHelper;
import org.springframework.stereotype.Service;

@Service
public class AlfrescoService {

    public AlfrescoDTO getResponse(String requestBodyString) {
        String textTransformed = AlfrescoHelper.rangeTransformer(requestBodyString);

        return new AlfrescoDTO(textTransformed +
                " " + AlfrescoHelper.createCompleteReport(textTransformed));
    }
}
