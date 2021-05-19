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
@Table("PLANTS")
public class Plants extends BaseEntity {

    @Column(UserConstant.PLANT_NAME)
    private String plantName;

    @Column(UserConstant.PLANT_CLASS)
    private String plantClass;

    @Column(UserConstant.PLANT_SPECIES)
    private String plantSpecies;

    @Column(UserConstant.PLANT_HUMIDITY)
    private Double plantHumidity;

    @Column(UserConstant.PLANT_LIGHTING)
    private Double plantLight;

    @Column(UserConstant.PLANT_FERTILIZER)
    private Double plantFertilizer;

    @Column(UserConstant.PLANT_PRICE)
    private Float price;

    @Column(UserConstant.PLANT_SALES_PRICE)
    private Float salesPrice;

    @Column(UserConstant.PLANT_MONTH_HARVEST)
    private String monthHarvest;

    @Column(UserConstant.PLANT_PREPARATION)
    private String plantPreparation;

}
