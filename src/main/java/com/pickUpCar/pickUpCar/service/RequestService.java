package com.pickUpCar.pickUpCar.service;

import com.pickUpCar.pickUpCar.entity.Request;
import java.util.List;

public interface RequestService {
    List<Request> getAllRequest();
    void saveRequest(Request request);
    void deleteRequestById(long id);
    Request getRequestById(long id);
}
