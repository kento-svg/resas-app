package com.resas.resasapp.controller.v1;

import com.resas.resasapp.domain.entity.Prefecture;
import com.resas.resasapp.domain.service.PrefectureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/prefectures")
@AllArgsConstructor
public class PrefectureController {
    private final PrefectureService service;

    @GetMapping("")
    public Prefecture find() {
        return service.getPrefectures();
    }
}
