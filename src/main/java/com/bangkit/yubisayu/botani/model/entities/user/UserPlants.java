package com.bangkit.yubisayu.botani.model.entities;

import com.bangkit.yubisayu.botani.constants.UserPlantsConstant;
import com.bangkit.yubisayu.botani.model.entities.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(UserPlantsConstant.USER_PLANTS)
public class UserPlants extends BaseEntity {

    @Column(UserPlantsConstant.PLANT_ID)
    private String plantId;

    @Column(UserPlantsConstant.USER_ID)
    private String userId;

    @Column(UserPlantsConstant.USER_PLANT_NAME)
    private String profilePicture;

    @Column(UserPlantsConstant.PLANT_HEALTH)
    private Double plantHealth;

    @Column(UserPlantsConstant.PLANT_IMAGE)
    private String plantImg;

    @Column(UserPlantsConstant.PLANT_DETAIL)
    private String plantDetail;

    @Column(UserPlantsConstant.PLANT_PHASE)
    private String plantPhase;

    @Column(UserPlantsConstant.PLANT_SUGGESTION)
    private String plantSuggest;

}