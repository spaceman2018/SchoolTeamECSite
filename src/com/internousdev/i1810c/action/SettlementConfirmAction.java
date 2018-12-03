package com.internousdev.i1810c.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.i1810c.dao.DestinationInfoDAO;
import com.internousdev.i1810c.dao.MCategoryDAO;
import com.internousdev.i1810c.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementConfirmAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() throws SQLException {
		String result = ERROR;
		if (!session.containsKey("mCategoryDtoList")) {
			session.put("mCategoryDtoList", (new MCategoryDAO()).getMCategoryList());
		}
		if(!session.containsKey("loginId")){
			session.put("isSettlement", true);
			session.remove("loginIdErrorMessageList");
			session.remove("passwordErrorMessageList");
			result=LOGIN;
		}else{
			session.put("isSettlement", true);
			DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
			List<DestinationInfoDTO> destinationInfoDtoList=new ArrayList<DestinationInfoDTO>();
			destinationInfoDtoList = destinationInfoDAO.getDestinationInfo(String.valueOf(session.get("loginId")));
			Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
			if (!(iterator.hasNext())) {
				destinationInfoDtoList = null;
			}
			session.put("destinationInfoDtoList", destinationInfoDtoList);
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
