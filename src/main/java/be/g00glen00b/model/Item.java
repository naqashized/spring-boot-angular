package be.g00glen00b.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Item {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  @Column
  private boolean checked;
  @Column
  private String description;
  @Column
  private Date created;
  @Column
  private Date updated;

  @PrePersist
  protected void onCreate() {
    created = new Date();
  }

  @PreUpdate
  protected void onUpdate() {
    updated = new Date();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public boolean isChecked() {
    return checked;
  }

  public void setChecked(boolean checked) {
    this.checked = checked;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

public Date getCreated() {
	return created;
}

public void setCreated(Date created) {
	this.created = created;
}

public Date getUpdated() {
	return updated;
}

public void setUpdated(Date updated) {
	this.updated = updated;
}
  

//public Timestamp getCreated_date() {
//	return created_date;
//}
//
//public void setCreated_date(Timestamp created_date) {
//	this.created_date = created_date;
//}


  
}
