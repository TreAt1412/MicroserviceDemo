package com.example.moviecatalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")

public class CatalogController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
    {

        //get all rated movieID

        UserRating userRating = restTemplate.getForObject("http://rating-data-service/ratingsdata/users/abc", UserRating.class);

        //for each moviedId, call movie-infor-service and get details(name)
        return userRating.getUserRating().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://movie-infor-service/movies/" + rating.getMovieId() , Movie.class);
            return new CatalogItem(movie.getName(),"desc",rating.getRating());
        }).collect(Collectors.toList());


    }

}
