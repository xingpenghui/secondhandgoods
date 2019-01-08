package com.qfedu.admin.entity;
//                       .::::.
//                     .::::::::.
//                    :::::::::::
//                 ..:::::::::::'
//              '::::::::::::'
//                .::::::::::
//           '::::::::::::::..
//                ..::::::::::::.
//              ``::::::::::::::::
//               ::::``:::::::::'        .:::.
//              ::::'   ':::::'       .::::::::.
//            .::::'      ::::     .:::::::'::::.
//           .:::'       :::::  .:::::::::' ':::::.
//          .::'        :::::.:::::::::'      ':::::.
//         .::'         ::::::::::::::'         ``::::.
//     ...:::           ::::::::::::'              ``::.
//    ```` ':.          ':::::::::'                  ::::..
//                       '.:::::'                    ':'````..
//
//

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//使用泛型，支持各种对象的返回
@Component
@Scope("prototype")
public class ResponseVo<T> {
	
	private int code;
	
	private String msg;
	
	private List<T> data;
	
	private Long count;
	

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public static ResponseVo OK(List o){
		ResponseVo vo	=new ResponseVo();
		vo.setMsg("success");
		vo.setCode(0);
		vo.setData(o);
		return  vo;
	}
	
	public static ResponseVo ERROR(){
		ResponseVo vo	=new ResponseVo();
		vo.setMsg("error");
		vo.setCode(1);
		return  vo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseVo [code=" + code + ", msg=" + msg + ", data=" + data + ", count=" + count + "]";
	}


}
