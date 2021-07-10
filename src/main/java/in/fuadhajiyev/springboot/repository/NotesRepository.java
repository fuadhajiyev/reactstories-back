package in.bushansirgur.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springboot.entity.Note;

@Repository
public interface StoriesRepository extends JpaRepository<Story, Long> {

}
