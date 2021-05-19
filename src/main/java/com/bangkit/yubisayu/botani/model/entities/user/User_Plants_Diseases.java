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
@Table("USERS PLANTS DISEASES")
public class User_Plants_Diseases extends BaseEntity {

    @Column(UserConstant.USER_PLANT_ID)
    private String userPlantId;

    @Column(UserConstant.PLANT_DISEASE_ID)
    private String plantDiseasesId;

}
