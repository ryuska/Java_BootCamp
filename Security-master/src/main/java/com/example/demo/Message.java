package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Message {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  @Size(min=4)
  private String title;

  @NotNull
  @Size(min=3)
  private String postedBy;

  @NotNull
  @Size(min=10)
  private String content;

  @NotNull
  private String postedDate;


  private String headshot;


  @ManyToOne (fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id")
  private User user;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPostedBy() {
    return postedBy;
  }

  public void setPostedBy(String postedBy) {
    this.postedBy = postedBy;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public String getHeadshot() {
    return headshot;
  }

  public void setHeadshot(String headshot) {
    this.headshot = headshot;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}



