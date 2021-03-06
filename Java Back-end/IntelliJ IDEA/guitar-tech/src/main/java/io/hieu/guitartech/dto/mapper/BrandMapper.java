package io.hieu.guitartech.dto.mapper;

import io.hieu.guitartech.domain.Brand;
import io.hieu.guitartech.dto.model.BrandDto;

public class BrandMapper {
    public static BrandDto toBrandDto(Brand brand) {
        return new BrandDto(
                brand.getId(),
                brand.getName(),
                brand.getLogoUrl()
        );
    }

    public static Brand toBrand(BrandDto brandDto) {
        Brand brand = new Brand();
        brand.setName(brandDto.getName());
        brand.setLogoUrl(brandDto.getLogoUrl());
        return brand;
    }
}