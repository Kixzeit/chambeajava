package com.example.helloworld.chambeaya.invoke;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Primary
@Service("invokeRestService")
public class InvokeRemoteRestServiceImpl implements InvokeRemoteRestService {
    private RestTemplate restTemplate;
    
    public InvokeRemoteRestServiceImpl(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }
    
    @Override
    public JwtBody checkJwt(String jwt) {
      String url = "https://access.qbits.mx/api/verify-jwt/" + jwt;
      return restTemplate.getForObject(url, JwtBody.class);
    }
    
    @Override
    public String profileImage(int id) {
      String url = "https://upload.qbits.mx/api/up/get-user-pricipal-image/" + id;
      return restTemplate.getForObject(url, String.class);
    }
}
