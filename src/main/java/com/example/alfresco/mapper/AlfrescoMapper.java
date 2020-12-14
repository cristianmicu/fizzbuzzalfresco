package com.example.alfresco.mapper;


import com.example.alfresco.dto.AlfrescoDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlfrescoMapper {

    public List<Integer> stringToList(String inputString) {
        List<Integer> result = new ArrayList<>();

        for (String integerAsString : inputString.split(",")) {
            result.add(Integer.parseInt(integerAsString));
        }

        return result;
    }

    public AlfrescoDTO listToDTO(List<String> integerList) {
        AlfrescoDTO alfrescoDTO = new AlfrescoDTO(integerList);

        return alfrescoDTO;
    }
}
