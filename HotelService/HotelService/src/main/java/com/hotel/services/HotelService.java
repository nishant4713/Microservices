package com.hotel.services;

import com.hotel.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HotelService {
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);

}
