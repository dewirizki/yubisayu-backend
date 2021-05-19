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
@Table("PLANT DISEASES")
public class Plant_diseases extends BaseEntity {

    @Column(UserConstant.DISEASE_NAME)
    private String diseaseName;

    @Column(UserConstant.DISEASE_DETAIL)
    private String diseaseDetail;

    @Column(UserConstant.DISEASE_TREATMENT)
    private String diseaseTreatment;

    @Column(UserConstant.DISEASE_TREATMENT_VIDEOS)
    private String diseaseTreatmentVid;

}
