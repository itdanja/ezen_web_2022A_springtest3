package springtest3.domain.entity;


import lombok.*;

import javax.persistence.*;


@Builder
@Getter
@Entity // 일반클래스 -> jpa entity 으로 사용
@Table(name = "membertest")
public class MemberEntitiy {

    @Id // pk 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY ) // auto key
    public Integer no;
    @Column
    public String name;
    @Column
    public String phone;
    @Column
    public String memo;

}
