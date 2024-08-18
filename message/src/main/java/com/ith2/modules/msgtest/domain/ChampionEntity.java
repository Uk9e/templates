package com.ith2.modules.msgtest.domain;


import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
@TableName("champions")
public class ChampionEntity {

	@TableId
	private Long id;

	private String title;

	private String name;

	private Integer age;

	private Integer gender;

	private String nationality;

	private String profession;

	private String faction;

	private String ult;

	private Integer health;

	private Integer mana;

	private Integer attackDamage;

	private Integer armor;

	private Integer magicResistance;

	@TableField(fill = FieldFill.INSERT)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	@TableField(fill = FieldFill.UPDATE)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	@TableLogic
	@JsonIgnore
	@TableField(fill = FieldFill.INSERT)
	private Integer isDel;

}
