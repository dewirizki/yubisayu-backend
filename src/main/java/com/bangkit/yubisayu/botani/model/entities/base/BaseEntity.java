package com.bangkit.yubisayu.botani.model.entities.base;

import com.bangkit.yubisayu.botani.constants.BaseEntityConstant;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.Column;

import java.sql.Date;
import java.util.UUID;

@Data
public abstract class BaseEntity {

    @Id
    @Column(BaseEntityConstant.ID)
    private UUID id;


    @Column(BaseEntityConstant.CREATED_AT)
    private Date createdAt;

    @Column(BaseEntityConstant.UPDATED_AT)
    private Date updatedAt;

    @Column(BaseEntityConstant.DELETED)
    private int deleted;
}
