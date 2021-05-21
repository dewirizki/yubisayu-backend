package com.bangkit.yubisayu.botani.model.entities.plant;

import com.bangkit.yubisayu.botani.constants.PlantDiseasesConstant;
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
@Table(PlantDiseasesConstant.PLANT_DISEASES)
public class PlantDiseases extends BaseEntity {

    @Column(PlantDiseasesConstant.DISEASE_NAME)
    private String diseaseName;

    @Column(PlantDiseasesConstant.DISEASE_DETAIL)
    private String diseaseDetail;

    @Column(PlantDiseasesConstant.DISEASE_TREATMENT)
    private String diseaseTreatment;

    @Column(PlantDiseasesConstant.DISEASE_TREATMENT_VIDEOS)
    private String diseaseTreatmentVid;

}
