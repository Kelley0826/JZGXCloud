package com.inspur.gs.fssp.pubjz.foundation.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA
 * Description: 系统用户实体类
 * Author: sakura sun (sunchao)
 * Date:  2019/8/27 16:04
 * Company: Inspur
 */
@Entity
@Data
@Table(name = "gspuser")
public class JZGSPUserDO {
    /**
     * id
     */
    @Id
    private String id;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name_chs;


    /**
     * 获取 id
     *
     * @return id id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 编号
     *
     * @return code 编号
     */
    public String getCode() {
        return this.code;
    }

    /**
     * 设置 编号
     *
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取 名称
     *
     * @return name_chs 名称
     */
    public String getName_chs() {
        return this.name_chs;
    }

    /**
     * 设置 名称
     *
     * @param name_chs 名称
     */
    public void setName_chs(String name_chs) {
        this.name_chs = name_chs;
    }

    @Override
    public String toString() {
        return "GSPUserDO{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name_chs='" + name_chs + '\'' +
                '}';
    }
}
