package com.ith2.modules.msgtest.service.impl;

import com.ith2.modules.msgtest.domain.Champion;
import com.ith2.modules.msgtest.mapper.ChampionMapper;
import com.ith2.modules.msgtest.service.ChampionService;
import com.ith2.common.service.impl.BaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChampionServiceImpl extends BaseServiceImpl<ChampionMapper, Champion> implements ChampionService {

}
