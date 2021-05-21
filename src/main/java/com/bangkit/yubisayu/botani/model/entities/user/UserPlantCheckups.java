package com.bangkit.yubisayu.botani.model.entities;

import com.bangkit.yubisayu.botani.constants.UserPlantCheckupsConstant;
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
@Table(UserPlantCheckupsConstant.USER_PLANT_CHECKUPS)
public class UserPlantCheckups extends BaseEntity {

    @Column(UserPlantCheckupsConstant.USER_PLANT_ID)
    private String userPlantId;

    @Column(UserPlantCheckupsConstant.USER_PLANT_HUMIDITY)
    private Double uplantHumidity;

    @Column(UserPlantCheckupsConstant.USER_PLANT_TEMPERATURE)
    private Double uplantTemperature;

    @Column(UserPlantCheckupsConstant.USER_PLANT_NITROGEN)
    private Double uplantNitrogen;

    @Column(UserPlantCheckupsConstant.USER_PLANT_POTASSIUM)
    private Double uplantPotassium;

    @Column(UserPlantCheckupsConstant.USER_PLANT_PHOSPHORUS)
    private Double uplantPhosphorus;
}
