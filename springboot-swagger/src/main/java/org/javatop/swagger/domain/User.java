package org.javatop.swagger.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-03-23 21:08
 * @description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`user`")
public class User {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "sex")
    private String sex;

    @TableField(value = "pwd")
    private String pwd;

    @TableField(value = "email")
    private String email;
}