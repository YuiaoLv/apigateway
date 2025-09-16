package com.yu.gateway.common.exception;

import com.yu.gateway.common.enums.ResponseCode;

/**
 * @description 网关未找到异常
 */
public class GatewayNotFoundException extends GatewayBaseException {

	private static final long serialVersionUID = -5534700534739261761L;

	public GatewayNotFoundException(ResponseCode code) {
		super(code.getMessage(), code);
	}

	public GatewayNotFoundException(Throwable cause, ResponseCode code) {
		super(code.getMessage(), cause, code);
	}

}
