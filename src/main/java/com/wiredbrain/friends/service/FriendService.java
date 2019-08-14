package com.wiredbrain.friends.service;

import com.wiredbrain.friends.models.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendService extends CrudRepository<Friend, Integer> {
}
