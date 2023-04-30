package com.example.helloworld.chambeaya.invoke;

public interface InvokeRemoteRestService {
  JwtBody checkJwt(String jwt);

  public String profileImage(int id);
}
