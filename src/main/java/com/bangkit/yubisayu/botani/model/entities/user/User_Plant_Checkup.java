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
@Table("USERS PLANT CHECKUP")
public class User_Plant_Checkup extends BaseEntity {

    @Column(UserConstant.USER_PLANT_ID)
    private String userPlantId;

    @Column(UserConstant.USER_PLANT_HUMIDITY)
    private Double uplantHumidity;

    @Column(UserConstant.USER_PLANT_TEMPERATURE)
    private Double uplantTemperature;

    @Column(UserConstant.USER_PLANT_NITROGEN)
    private Double uplantNitrogen;

    @Column(UserConstant.USER_PLANT_POTASSIUM)
    private Double uplantPotassium;

    @Column(UserConstant.USER_PLANT_PHOSPHORUS)
    private Double uplantPhosphorus;
}
