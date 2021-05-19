package com.bangkit.yubisayu.botani.model.entities.user;

import com.bangkit.yubisayu.botani.constants.UserConstant;
import com.bangkit.yubisayu.botani.model.entities.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("USERS_PLANTS")
public class User_plants extends BaseEntity {

    @Column(UserConstant.FULLNAME)
    private String fullName;

    @Column(UserConstant.EMAIL)
    private String email;

    @Column(UserConstant.PROFILE_PICTURE)
    private String profilePicture;

    @Column(UserConstant.ADDRESS)
    private String address;

    @Column(UserConstant.CITY)
    private String city;

    @Column(UserConstant.PASSWORD)
    private String password;

    @Column(UserConstant.SEX)
    private int sex;

    @Column(UserConstant.BIRTH_DATE)
    private Date birthDate;

}