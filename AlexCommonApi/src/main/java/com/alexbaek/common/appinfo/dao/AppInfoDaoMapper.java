/***************************************************************************************************
*   @클래스명  : AppInfoDaoMapper.java
*   @패키지명  : com.alexbaek.common.appinfo.dao
*   @작성자	: 백우영
*   @작성일	: 2017. 3. 20. 오전 11:48:43
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.dao;

import com.alexbaek.common.appinfo.vo.AppInfoVO;

/**
 * The Class AppInfoDaoMapper.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
public interface AppInfoDaoMapper {
	
	public AppInfoVO selectAppInfo(AppInfoVO appInfo) throws Exception;
}
