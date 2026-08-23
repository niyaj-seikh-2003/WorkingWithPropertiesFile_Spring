package com.nt.sneans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value="com/nt/commons/Info.properties")
public class PersonInfo 
{
	@Value("${per.id}")
	private Integer pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.addrs}")
	private String address;
	@Value("9876543210")
	private Long monileNo;
	@Value("${os.name}")
	private String os_name;
	@Value("${os.version}")
	private String os_ver;
	@Value("${path}")
	private String path_date;
	
	
	
	
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", address=" + address + ", monileNo=" + monileNo
				+ ", os_name=" + os_name + ", os_ver=" + os_ver + ", path_date=" + path_date + "]";
	}
	
	

}
