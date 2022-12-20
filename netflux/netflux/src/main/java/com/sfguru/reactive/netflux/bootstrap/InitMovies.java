package com.sfguru.reactive.netflux.bootstrap;



import com.sfguru.reactive.netflux.domain.Movie;
import com.sfguru.reactive.netflux.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Component

public class InitMovies implements CommandLineRunner {


    private final MovieRepository movieRepository;

    @Override
    public void run(String... args) throws Exception {

        movieRepository.deleteAll()
                .thenMany(
                        Flux.just("Avengers","Spidy","IronMan","Kaidhi","Master","Vikram","Chennai-28")
                                .map(Movie::new)
                                .flatMap(movieRepository::save)
                ).subscribe(null,null,()->{
                    movieRepository.findAll().subscribe(System.out::println);
                });

    }
}
