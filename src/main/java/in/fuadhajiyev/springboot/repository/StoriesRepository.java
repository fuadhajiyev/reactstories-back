package in.fuadhajiyev.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.fuadhajiyev.springboot.entity.Story;

@Repository
public interface StoriesRepository extends JpaRepository<Story, Long> {

}
