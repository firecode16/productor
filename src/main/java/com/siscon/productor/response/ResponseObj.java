package com.siscon.productor.response;

/**
 * @author Fredi
 * 
 */
public class ResponseObj {

	private String result;
	private Object data;

	public ResponseObj(String result, Object data) {
		super();
		this.result = result;
		this.data = data;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
