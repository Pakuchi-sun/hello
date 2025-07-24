package jp.kobe_u.cs.daikibo.tsubuyaki.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import jp.kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;

@Repository
public interface TsubuyakiRepository extends CrudRepository<Tsubuyaki, Long>{

    @Query("SELECT t FROM Tsubuyaki t WHERE t.comment LIKE %:keyword%")
    List<Tsubuyaki> findByCommentContaining(@Param("keyword") String keyword);
}
