package project.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.back.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
