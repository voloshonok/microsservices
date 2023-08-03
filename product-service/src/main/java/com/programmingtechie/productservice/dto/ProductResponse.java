package com.programmingtechie.productservice.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProductResponse(String name, String description, BigDecimal price) {
}
