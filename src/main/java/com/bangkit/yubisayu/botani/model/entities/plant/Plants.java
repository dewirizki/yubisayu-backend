package com.bangkit.yubisayu.botani.model.entities;

import com.bangkit.yubisayu.botani.constants.PlantsConstant;
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
@Table(PlantsConstant.PLANTS)
public class Plants extends BaseEntity {

    @Column(PlantsConstant.PLANT_NAME)
    private String plantName;

    @Column(PlantsConstant.PLANT_CLASS)
    private String plantClass;

    @Column(PlantsConstant.PLANT_SPECIES)
    private String plantSpecies;

    @Column(PlantsConstant.PLANT_HUMIDITY)
    private Double plantHumidity;

    @Column(PlantsConstant.PLANT_LIGHTING)
    private Double plantLight;

    @Column(PlantsConstant.PLANT_FERTILIZER)
    private Double plantFertilizer;

    @Column(PlantsConstant.PLANT_PRICE)
    private Float price;

    @Column(PlantsConstant.PLANT_SALES_PRICE)
    private Float salesPrice;

    @Column(PlantsConstant.PLANT_MONTH_HARVEST)
    private String monthHarvest;

    @Column(PlantsConstant.PLANT_PREPARATION)
    private String plantPreparation;

}
