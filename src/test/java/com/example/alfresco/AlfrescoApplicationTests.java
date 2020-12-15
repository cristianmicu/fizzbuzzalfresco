package com.example.alfresco;

import com.example.alfresco.controller.AlfrescoController;
import com.example.alfresco.service.AlfrescoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = AlfrescoApplication.class)
@AutoConfigureMockMvc
class AlfrescoApplicationTests {
    private final String INPUT = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20";

    @InjectMocks
    private AlfrescoService alfrescoService;

    @InjectMocks
    private AlfrescoController alfrescoController;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    public void setUp() {
        alfrescoService = new AlfrescoService();
        alfrescoController = new AlfrescoController();
    }

    @Test
    void contextLoads() {
        assertThat(alfrescoController).isNotNull();
    }

    @Test
    public void alfrescoServiceTest() {
        String actual = alfrescoService.getResponse(INPUT).toString();
        String expected = "1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 alfresco: 2 integer: 10";
        assertEquals(expected, actual);
    }

    @Test
    public void getResponseTest() throws Exception {
        String expectedString = "1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 alfresco: 2 integer: 10";
        mvc.perform(get("/api/fizzbuzz").content(INPUT)
                .contentType(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)).equals(expectedString);
    }

}
