package com.cardiff.maplife.repositories;

import com.cardiff.maplife.entities.Event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    Optional <Event> findByTitle(String name);
}

