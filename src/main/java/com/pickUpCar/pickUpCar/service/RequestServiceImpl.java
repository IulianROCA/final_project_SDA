package com.pickUpCar.pickUpCar.service;

import com.pickUpCar.pickUpCar.entity.Request;
import com.pickUpCar.pickUpCar.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    RequestRepository requestRepository;

    @Override
    public List<Request> getAllRequest() { return this.requestRepository.findAll(); }

    @Override
    public void saveRequest(Request request) { this.requestRepository.save(request); }

    @Override
    public void deleteRequestById(long id) { this.requestRepository.deleteById(id); }

    @Override
    public Request getRequestById(long id) {
        Optional<Request> optional = requestRepository.findById(id);
        Request request = null;
        if(optional.isPresent()){
            request = optional.get();
        }else{
            throw new RuntimeException("Request not found for id ::" + id);
        }
        return request;
    }
}
