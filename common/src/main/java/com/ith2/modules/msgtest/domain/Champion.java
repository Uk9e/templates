package com.ith2.modules.msgtest.domain;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ith2.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("champions")
@EqualsAndHashCode(callSuper = true)
public class Champion extends BaseEntity {

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

}
