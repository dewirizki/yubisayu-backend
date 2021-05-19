public
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
@Table("USERS PLANTS")
public class User_plants extends BaseEntity {

    @Column(UserConstant.PLANT_ID)
    private String plantId;

    @Column(UserConstant.USER_ID)
    private String userId;

    @Column(UserConstant.USER_PLANT_NAME)
    private String profilePicture;

    @Column(UserConstant.PLANT_HEALTH)
    private Double plantHealth;

    @Column(UserConstant.PLANT_IMAGE)
    private String plantImg;

    @Column(UserConstant.PLANT_DETAIL)
    private String plantDetail;

    @Column(UserConstant.PLANT_PHASE)
    private String plantPhase;

    @Column(UserConstant.PLANT_SUGGESTION)
    private String plantSuggest;

}