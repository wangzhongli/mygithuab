package com.e1858.building.httppackage;

import com.e1858.building.bean.PacketResp;
import com.e1858.building.net.HttpDefine;

@SuppressWarnings("serial")
public class DeleteCanceledOrderResponse extends PacketResp {

	public DeleteCanceledOrderResponse() {
		command = HttpDefine.DELETECANCELEDORDER_RESP;
	}

}
