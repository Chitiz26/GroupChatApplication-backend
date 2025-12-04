package com.substring.chat.application_backend.repositories;

import com.substring.chat.application_backend.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room,String>
{
  Room findByRoomId(String roomId);

}
