/***************************************************************************************************
*   @클래스명  : AppInfoController.java
*   @패키지명  : com.alexbaek.common.appinfo.controller
*   @작성자	: 백우영
*   @작성일	: 2017. 2. 13. 오후 1:14:16
************************** @수정이력 ****************************************************************
*  수정일    수정자   수정내용
*     
***************************************************************************************************/
package com.alexbaek.common.appinfo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alexbaek.common.appinfo.service.AppInfoService;
import com.alexbaek.common.appinfo.vo.AppInfoVO;
import com.alexbaek.common.appinfo.vo.Greeting;

/**
 * The Class AppInfoController.java.
 * 설명 :
 *
 * @author 백우영
 * @version 1.0
 */
@RestController
public class AppInfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(AppInfoController.class);
	
	@Autowired
	private AppInfoService mAppInfoService;
	
	/**
	 * Comment : Test API.
	 * Date	: 2017. 2. 17.
	 * @return Greeting
	 * @param name
	 * @return
	 */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	Greeting greeting = new Greeting();
    	greeting.setId(1);
    	greeting.setContent("Hello");
    	return greeting;
    }
    
    /**
     * Comment : 앱에 대한 정보를 리턴. 
     * Date	: 2017. 2. 22.
     * @return void
     */
    @RequestMapping(value = "/getAppInfo", method = RequestMethod.POST)
    public AppInfoVO getAppInfo() {
    	
    	logger.info("==================== {} ====================", "AppInfoController :: getAppInfo");
    	
    	AppInfoVO resultVO = new AppInfoVO();
    	resultVO.setServiceId("1004");
    	resultVO.setServiceType("01");
    	resultVO.setServiceName("App Info");
    	resultVO.setServicePackage("com.alexbaek.common");
    	resultVO.setServiceRegDate("1987-03-01");
    	
    	AppInfoVO temp = mAppInfoService.getAppInfo();
    	
    	return resultVO;
    }
    
    
}