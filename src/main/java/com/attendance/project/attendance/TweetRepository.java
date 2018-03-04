package com.attendance.project.attendance;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TweetRepository extends ReactiveCrudRepository<Tweet,String>{
}
