package sandadi.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
/*@XmlRootElement*/
public class Profile {
	private String name;
	private long id;
	private int age;
	
	public Profile()
	{
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private Date created;

	public Profile(String name, long id,int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.created = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
