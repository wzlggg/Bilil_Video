package club.evolutioniot.ssh.system.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class VedioType implements Serializable{
	private Integer vedioTypeId;
	private String vedioTypeName;
	private String vedioTypeDescribe;
	
	private Set<Vedio> vedios=new HashSet<>();
	
	public Integer getVedioTypeId() {
		return vedioTypeId;
	}
	public void setVedioTypeId(Integer vedioTypeId) {
		this.vedioTypeId = vedioTypeId;
	}
	public String getVedioTypeName() {
		return vedioTypeName;
	}
	public void setVedioTypeName(String vedioTypeName) {
		this.vedioTypeName = vedioTypeName;
	}
	public String getVedioTypeDescribe() {
		return vedioTypeDescribe;
	}
	public void setVedioTypeDescribe(String vedioTypeDescribe) {
		this.vedioTypeDescribe = vedioTypeDescribe;
	}
	public Set<Vedio> getVedios() {
		return vedios;
	}
	public void setVedios(Set<Vedio> vedios) {
		this.vedios = vedios;
	}
	@Override
	public String toString() {
		return "VedioType [vedioTypeId=" + vedioTypeId + ", vedioTypeName=" + vedioTypeName + ", vedioTypeDescribe="
				+ vedioTypeDescribe +  "]";
	}
	
	
	
	
}
