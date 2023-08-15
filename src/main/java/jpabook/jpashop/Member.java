package jpabook.jpashop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
/* Entity : DB 테이블에 대응하는 하나의 클래스
*           @Entity가 붙은 클래스는 JPA가 관리해주며, JPA를 사용해서 DB테이블과 매핑할 클래스는 @Entity를 붙여야만 매핑이 가능함
* 주의사항 : 접근제어자가 public 혹은 protected인 기본 생성자가 필수. final 클래스, enum, interface, inner 클래스엔 사용 불가
*           저장하려는 속성은 final이면 안 됨.
* */
@Getter @Setter
public class Member {

    @Id @GeneratedValue // id : 식별자.
    private Long id;
    private String username;

}
