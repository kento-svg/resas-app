package com.resas.resasapp.domain.service;

import com.resas.resasapp.domain.entity.Prefecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrefectureServiceImpl implements PrefectureService {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${url}")
    private String url;
    @Value("${apikey}")
    private String apikey;

    @Override
    public Prefecture getPrefectures() {
        RequestEntity<Void> requestEntity = RequestEntity
                .get(url + "/prefectures")
                .header("X-API-KEY", apikey)
                .build();
        // HTTP REQUEST FOR PREFECTURE API
        ResponseEntity<Prefecture> responseEntity = restTemplate.exchange(requestEntity, Prefecture.class);
        return responseEntity.getBody();
    }
}
