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

//  public String getAuthor() {
//    return author;
//  }
//
//  public void setAuthor(String author) {
//    this.author = author;
//  }
//
//  @NotNull
//  private String author;

  @ManyToOne (fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id")
  private User user;

//  public Course() {
//  }
//
//  public Course(@NotNull @Size(min = 4) String title, @NotNull @Size(min = 3) String instructor, @NotNull @Size(min = 10) String description, @NotNull @Min(3) int credit) {
//    this.title = title;
//    this.instructor = instructor;
//    this.description = description;
//    this.credit = credit;
//  }
//
//  public long getId() {
//    return id;
//  }
//
//  public void setId(long id) {
//    this.id = id;
//  }
//
//  public String getTitle() {
//    return title;
//  }
//
//  public void setTitle(String title) {
//    this.title = title;
//  }
//
//  public String getInstructor() {
//    return instructor;
//  }
//
//  public void setInstructor(String instructor) {
//    this.instructor = instructor;
//  }
//
//  public String getDescription() {
//    return description;
//  }
//
//  public void setDescription(String description) {
//    this.description = description;
//  }
//
//  public int getCredit() {
//    return credit;
//  }
//
//  public void setCredit(int credit) {
//    this.credit = credit;
//  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

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
}
