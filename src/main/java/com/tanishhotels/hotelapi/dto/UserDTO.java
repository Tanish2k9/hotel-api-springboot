package com.tanishhotels.hotelapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tanishhotels.hotelapi.enums.Role;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private Role role;
    private List<BookingDTO> bookings = new ArrayList<>();
}
