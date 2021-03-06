package com.xzx.service;

import com.xzx.model.Lawparent;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Helen
 * @since 2019-10-09
 */
public interface ILawparentService extends IService<Lawparent> {
	List<Lawparent> getQuestionsByType(String assistanceId);
}
