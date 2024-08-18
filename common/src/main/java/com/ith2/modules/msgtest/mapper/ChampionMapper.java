package com.ith2.modules.msgtest.mapper;

import com.ith2.modules.msgtest.domain.Champion;
import com.ith2.common.mapper.CoreMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChampionMapper extends CoreMapper<Champion> {
}
