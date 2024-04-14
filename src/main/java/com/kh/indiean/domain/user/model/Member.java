package com.kh.indiean.domain.user.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "member")
@Data
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mem_seq")
    @SequenceGenerator(sequenceName = "member_seq", allocationSize = 1, name = "mem_seq")
    private int userNo;
    /*
    시퀀스에 별칭 부여
    이유 : Entity에서 Camel Case로 작성하게 되면 Default가 ‘_‘로 합쳐진 형태의 컬럼명과 매핑을 시도
     */
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_Id")
    private String userId;

}
