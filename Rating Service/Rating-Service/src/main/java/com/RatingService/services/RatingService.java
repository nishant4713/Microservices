package com.RatingService.services;

import com.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RatingService {
    Rating create(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUserId(String userId);
    List<Rating> getRatingByHotelId(String HotelId);
}
