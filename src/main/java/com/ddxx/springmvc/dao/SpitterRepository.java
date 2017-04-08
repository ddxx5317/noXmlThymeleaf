package com.ddxx.springmvc.dao;

import com.ddxx.springmvc.bean.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}
