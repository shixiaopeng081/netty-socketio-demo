package com.sunlands.netty.socketio.repository;

import org.springframework.data.repository.CrudRepository; 

import com.sunlands.netty.socketio.bean.ClientInfo;

  
public interface ClientInfoRepository extends CrudRepository<ClientInfo, String>{ 
  ClientInfo findClientByclientid(String clientId); 
} 
