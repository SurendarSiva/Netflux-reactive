package com.sfguru.reactive.netflux.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor

public class Movie {

    private String id;
    @NonNull
    private String title;

}
