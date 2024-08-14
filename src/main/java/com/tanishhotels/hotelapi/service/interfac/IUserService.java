package com.tanishhotels.hotelapi.service.interfac;

import com.tanishhotels.hotelapi.dto.LoginRequest;
import com.tanishhotels.hotelapi.dto.Response;
import com.tanishhotels.hotelapi.entity.UserEntity;

public interface IUserService {
    Response register(UserEntity user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
