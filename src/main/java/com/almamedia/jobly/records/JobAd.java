package com.almamedia.jobly.records;

public record JobAd(
    int id,
    String title,

    String companyName,
    String companyLogoUrl,
    String publishDate,
    String expireDate,

    String locationRegion,
    String locationCity
) {
}

