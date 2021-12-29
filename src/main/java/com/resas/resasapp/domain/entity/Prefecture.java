package com.resas.resasapp.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class Prefecture {
    private String message;
    private List<PrefectureInner> result;
}
