package com.oguzhant.issuemanagement.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
/** lombok getter setter metotlarını oluşturuyor. @Data ile yada @getter @setter yazarız
 * MappedSuperClasss Jpa dan gelen o classın tüm tablolarda exten edilebilir oluyor.**/
/** abstract class **/
@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by",length = 50)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "updated_by",length = 50)
    private String updatedBy;

    @Column(name = "status")
    private Boolean status;
}
