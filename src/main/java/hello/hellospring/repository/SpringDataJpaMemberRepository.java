package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {


    @Override
    Optional<Member> findByName(String name);
    //JPQL select m from Member m where m.name = ?

    /**
     *  - 실무에서는 JPA와 스프링 데이터 JPA를 기본으로 사용하고, 복잡한 동적 쿼리는 Querydsl이라는 라이브러리를 사용하면 됨.
     *      이외의 복잡한 쿼리는 네이티브 쿼리 사용하거나 JdbcTemplate 사용.
     */
}
