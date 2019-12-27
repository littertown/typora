package com.town.test.model;

import com.alibaba.excel.annotation.ExcelProperty;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.naming.Name;
import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "test")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "test")
public class Test implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ExcelProperty("a")
    private int id;
    @Column
    @ExcelProperty("num")
    private String num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
