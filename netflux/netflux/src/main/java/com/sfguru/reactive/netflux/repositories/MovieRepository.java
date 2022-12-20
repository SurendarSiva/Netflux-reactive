package com.sfguru.reactive.netflux.repositories;

import com.sfguru.reactive.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;



public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
