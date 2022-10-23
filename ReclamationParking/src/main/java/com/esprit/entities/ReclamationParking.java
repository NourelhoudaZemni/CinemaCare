package com.esprit.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ReclamationParking")
public class ReclamationParking implements Serializable {


  private static final long serialVersionUID = -1741519260556429015L;
  @Column(name="id")
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  @Column(name="type")
  private String type;
  @Column(name="content")
  private String content;

  public ReclamationParking() {
    super();
  }

  public ReclamationParking(int id,String nom,String titre,String content) {
    super();
    this.id = id;
    this.type = titre;
    this.content = content;
  }


  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public String getTitre() {
    return type;
  }

  public void setTitre(String titre) {
    this.type = titre;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }



}
