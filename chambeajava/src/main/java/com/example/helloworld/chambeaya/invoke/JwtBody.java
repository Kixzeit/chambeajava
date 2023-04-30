package com.example.helloworld.chambeaya.invoke;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtBody {
  private int userId;
  private String mail;
  private String role;
  private long creation;
}
