package com.bangkit.yubisayu.botani.model.entities.user;

import com.bangkit.yubisayu.botani.constants.UserPlantDiseasesConstant;
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
@Table(UserPlantDiseasesConstant.USER_PLANT_DISEASES)
public class UserPlantDiseases extends BaseEntity {

    @Column(UserPlantDiseasesConstant.USER_PLANT_ID)
    private String userPlantId;

    @Column(UserPlantDiseasesConstant.PLANT_DISEASES_ID)
    private String plantDiseasesId;

}
