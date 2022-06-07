package springtest3.domain.entity;


import lombok.*;

import javax.persistence.*;


@Builder
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Entity // 해당 클래스를 엔티티[ DB내 테이블과 매핑 ] 로 사용
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
