package com.springboot.community.web.repository;

import com.springboot.community.web.domain.Board;
import com.springboot.community.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
